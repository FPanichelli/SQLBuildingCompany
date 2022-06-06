package com.solvd.BuildingCompany.DAOs;

import com.solvd.BuildingCompany.DAOs.interfaces.ISupervisorDao;
import com.solvd.BuildingCompany.domain.Supervisor;
import com.solvd.BuildingCompany.utils.exceptions.DAOException;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SupervisorDAO extends AbstractConnectionDAO implements ISupervisorDao {

    private final static String GET_ALL = "SELECT * FROM supervisor";

    private Supervisor convert(ResultSet rs) throws SQLException {
        String first_name = rs.getString("first_name");
        String last_name = rs.getString("last_name");
        Integer client_id = rs.getInt("client_id");
        Supervisor sv = new Supervisor(first_name, last_name, client_id);
        sv.setId(rs.getInt("id"));
        return sv;
    }

    @Override
    public Supervisor getById(int i) throws SQLException, DAOException, ConnectException {
        return null;
    }

    @Override
    public void insert(Supervisor supervisor) throws SQLException, DAOException, ConnectException {

    }

    @Override
    public void update(int id, Supervisor supervisor) throws SQLException, DAOException, ConnectException {

    }

    @Override
    public void delete(int t) throws SQLException, DAOException, ConnectException {

    }

    @Override
    public List<Supervisor> selectAll() throws SQLException, DAOException, ConnectException {
        PreparedStatement statement = null;
        Connection conn = getConnection();
        ResultSet rs = null;
        List<Supervisor> supervisors = new ArrayList<>();
        try {
            statement = conn.prepareStatement(GET_ALL);
            rs = statement.executeQuery();
            while (rs.next()) {
                supervisors.add(convert(rs));
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
        return supervisors;
    }
}
