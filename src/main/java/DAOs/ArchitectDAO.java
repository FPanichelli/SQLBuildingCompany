package DAOs;

import domain.Architect;
import domain.interfaces.IArchitectDao;

import java.sql.*;
import java.util.List;

public class ArchitectDAO implements IArchitectDao {
    @Override
    public Architect getById(int id) throws SQLException {
        String query = "select * from architect where id = ?";
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/Facundo_Panichelli", "root", "devintern");
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Architect(resultSet.getInt("id"), resultSet.getString("first_name"), resultSet.getString("last_name"),
                    resultSet.getInt("buildings_id"));
        } catch (SQLException e) {
            throw new SQLException();
        }
    }

    @Override
    public void insert(IArchitectDao iArchitectDao) throws SQLException {

    }

    @Override
    public void update(IArchitectDao iArchitectDao, String[] params) {

    }


    @Override
    public List<IArchitectDao> selectAll() throws SQLException {
        return null;
    }
}
