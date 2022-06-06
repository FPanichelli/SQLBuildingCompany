package com.solvd.BuildingCompany.DAOs;

import com.solvd.BuildingCompany.domain.Buildings;
import com.solvd.BuildingCompany.DAOs.interfaces.IBuildingsDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;

public class BuildingsDAO implements IBuildingsDao {

    private static Logger LOGGER = LogManager.getLogger(BuildingsDAO.class);

    @Override
    public Buildings getById(int id) throws SQLException {
        String query = "select * from buildings where id = ?";
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/Facundo_Panichelli", "root", "devintern");
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Buildings(resultSet.getInt("id"), resultSet.getString("type"), resultSet.getInt("stories"), resultSet.getInt("construction_lot_id"), resultSet.getInt("project_id"), resultSet.getInt("supervisor_id"));
        } catch (SQLException e) {
            throw new SQLException();
        }
    }

    @Override
    public void insert(Buildings building) throws SQLException {
        String query = "INSERT INTO buildings (id,type,stories,construction_lot_id,project_id,supervisor_id) VALUES (?,?,?,?,?,?)";
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/Facundo_Panichelli", "root", "devintern");
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, building.getId());
            ps.setString(2, building.getType());
            ps.setInt(3, building.getStories());
            ps.setInt(4, building.getConstructionLotId());
            ps.setObject(5, building.getProjectId());
            ps.setInt(6, building.getSupervisorId());
            ps.executeUpdate();
            LOGGER.info("Building successfully added to DB server");
        } catch (SQLException e) {
            LOGGER.info(e);
        }
    }

    @Override
    public void update(int id, Buildings buildings) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("not implemented");
    }

    @Override
    public void delete(int t) throws SQLException {

    }

    @Override
    public void delete(Buildings buildings) throws SQLException {
        String query = "DELETE FROM buildings WHERE id = ?";
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/Facundo_Panichelli", "root", "devintern");
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(4, buildings.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException(e);
        }

    }

    @Override
    public List<Buildings> selectAll() {
        return null;
    }
}