package com.solvd.BuildingCompany.DAOs;

import com.solvd.BuildingCompany.utils.exceptions.DAOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.ConnectException;
import java.sql.*;
import java.util.List;
import com.solvd.BuildingCompany.domain.Machinery;
import com.solvd.BuildingCompany.DAOs.interfaces.IMachineryDao;

import static java.sql.DriverManager.getConnection;


public class MachineryDAO extends AbstractConnectionDAO implements IMachineryDao {

    private static Logger LOGGER = LogManager.getLogger(MachineryDAO.class);

    private final static String GET_BY_ID = "SELECT * FROM machinery WHERE id = ?";

    private Machinery convert(ResultSet rs) throws SQLException {
        String licensePlate = rs.getString("license_plate");
        String model = rs.getString("model");
        String type  = rs.getString("type");
        Integer operatorId = rs.getInt("operators_id");
        Machinery ar = new Machinery(licensePlate, model, type, operatorId);
        ar.setId(rs.getInt("id"));
        return ar;
    }

    @Override
    public Machinery getById(int id) throws DAOException, SQLException, ConnectException {
        PreparedStatement statement = null;
        Connection conn = getConnection();
        ResultSet rs = null;
        Machinery a;
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
    public void insert(Machinery machinery) throws SQLException {

    }

    @Override
    public void update(int id, Machinery machinery) {

    }

    @Override
    public void delete(int t) throws SQLException {

    }


    @Override
    public List<Machinery> selectAll() throws SQLException {
        return null;
    }
}
