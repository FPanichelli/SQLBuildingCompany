package com.solvd.BuildingCompany.DAOs;

import com.solvd.BuildingCompany.DAOs.interfaces.IArchitectDao;
import com.solvd.BuildingCompany.domain.Architect;
import com.solvd.BuildingCompany.utils.exceptions.DAOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArchitectDAO extends AbstractConnectionDAO implements IArchitectDao {

    private static Logger LOGGER = LogManager.getLogger(ArchitectDAO.class);

    private final static String INSERT = "INSERT INTO architect(id, first_name, last_name, buildings_id) VALUES(?, ?, ?, ?)";
    private final static String UPDATE = "UPDATE architect SET first_name = ?, last_name = ?, buildings_id = ? WHERE id = ?";
    private final static String DELETE = "DELETE FROM architect WHERE id = ?";
    private final static String GET_ALL = "SELECT * FROM architect";
    private final static String GET_BY_ID = "SELECT * FROM architect WHERE id = ?";

    private Architect convert(ResultSet rs) throws SQLException {
        String first_name = rs.getString("first_name");
        String last_name = rs.getString("last_name");
        Integer buildings_id = rs.getInt("buildings_id");
        Architect ar = new Architect(first_name, last_name, buildings_id);
        ar.setId(rs.getInt("id"));
        return ar;
    }

    @Override
    public Architect getById(int id) throws DAOException, SQLException, ConnectException {
        PreparedStatement statement = null;
        Connection conn = getConnection();
        ResultSet rs = null;
        Architect a;
        try {
            statement = conn.prepareStatement(GET_BY_ID);
            statement.setInt(1, id);
            rs = statement.executeQuery();

            if (rs.next()) {
                a = convert(rs);
            } else {
                throw new DAOException("not found.");
            }
        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }
        }
        return a;
    }

    @Override
    public void insert(Architect a) throws DAOException, SQLException, ConnectException {
        PreparedStatement statement = null;
        Connection conn = getConnection();
        try {
            statement = conn.prepareStatement(INSERT);
            statement.setInt(1, a.getId());
            statement.setString(2, a.getFirstName());
            statement.setString(3, a.getLastName());
            statement.setInt(4, a.getBuildingsId());

            if (statement.executeUpdate() == 0) {
                throw new DAOException("Not properly inserted");
            }

        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new DAOException("SQL ERROR.", e);
                }
            }
        }
    }

    @Override
    public void update(int id, Architect a) throws SQLException, DAOException, ConnectException {
        PreparedStatement statement = null;
        Connection conn = getConnection();
        try {
            statement = conn.prepareStatement(UPDATE);

            statement.setString(1, a.getFirstName());
            statement.setString(2, a.getLastName());
            statement.setInt(3, a.getBuildingsId());
            statement.setInt(4, id);

            if (statement.executeUpdate() == 0) {
                throw new DAOException("Not properly updated");
            }

        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new DAOException("SQL ERROR.", e);
                }
            }
        }
    }

    @Override
    public void delete(int id) throws SQLException, DAOException, ConnectException {
        PreparedStatement statement = null;
        Connection conn = getConnection();
        try {
            statement = conn.prepareStatement(DELETE);
            statement.setInt(1, id);


            if (statement.executeUpdate() == 0) {
                throw new DAOException("Not properly deleted");
            }

        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new DAOException("SQL ERROR.", e);
                }
            }
        }
    }

    @Override
    public List<Architect> selectAll() throws SQLException, DAOException, ConnectException {
        PreparedStatement statement = null;
        Connection conn = getConnection();
        ResultSet rs = null;
        List<Architect> architects = new ArrayList<>();
        try {
            statement = conn.prepareStatement(GET_ALL);
            rs = statement.executeQuery();
            while (rs.next()) {
                architects.add(convert(rs));
            }
        } catch (SQLException e) {
            throw new DAOException("SQL ERROR.", e);
        } finally {
            returnConnection(conn);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    new DAOException("SQL ERROR.", e);
                }
            }

        }
        return architects;
    }
}
