package domain.DAOs;

import domain.Buildings;
import domain.interfaces.IBuildingsDao;

import java.sql.*;
import java.util.List;

public class BuildingsDAO implements IBuildingsDao {

    @Override
    public Buildings getById(int id) throws SQLException {
        String query = "select * from buildings where id = ?";
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/Facundo_Panichelli", "root", "devintern" );
        try(PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, 3);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Buildings(resultSet.getInt("id"), resultSet.getString("type"), resultSet.getInt("stories"),
                    resultSet.getInt("construction_lot_id"), resultSet.getInt("project_id"), resultSet.getInt("supervisor_id"));
        } catch (SQLException e){
            throw new SQLException();
        }
    }

    @Override
    public void save(Buildings buildings) throws SQLException {

    }

    @Override
    public void update(Buildings buildings, String[] params) {

    }

    @Override
    public void delete(Buildings buildings) {

    }

    @Override
    public List<Buildings> selectAll() throws SQLException {
        return null;
    }
}
