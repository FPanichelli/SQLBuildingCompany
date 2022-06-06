package com.solvd.BuildingCompany.DAOs;

import com.solvd.BuildingCompany.domain.Machinery;
import com.solvd.BuildingCompany.DAOs.interfaces.IMachineryDao;

import java.sql.*;
import java.util.List;

public class MachineryDAO implements IMachineryDao {
    @Override
    public Machinery getById(int id) throws SQLException {
        String query = "select * from machinery where id = ?";
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/Facundo_Panichelli", "root", "devintern");
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Machinery(resultSet.getInt("id"), resultSet.getString("license_plate"), resultSet.getString("model"),
                    resultSet.getString("type"), resultSet.getInt("operators_id"));
        } catch (SQLException e) {
            throw new SQLException();
        }
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
