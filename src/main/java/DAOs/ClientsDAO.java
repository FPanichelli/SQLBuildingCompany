package DAOs;

import domain.Client;
import domain.interfaces.IClientDao;

import java.sql.*;
import java.util.List;

public class ClientsDAO implements IClientDao {
    @Override
    public Client getById(int id) throws SQLException {
        String query = "select * from client where id = ?";
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/Facundo_Panichelli", "root", "devintern");
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Client(resultSet.getInt("id"), resultSet.getString("first_name"), resultSet.getString("last_name"),
                    resultSet.getString("phone_number"), resultSet.getInt("payment_id"), resultSet.getInt("budget"),
                    resultSet.getInt("supervisor_id"));
        } catch (SQLException e) {
            throw new SQLException();
        }
    }

    @Override
    public void insert(Client client) throws SQLException {

    }

    @Override
    public void update(Client client, String[] params) {

    }


    @Override
    public List<Client> selectAll() throws SQLException {
        return null;
    }
}
