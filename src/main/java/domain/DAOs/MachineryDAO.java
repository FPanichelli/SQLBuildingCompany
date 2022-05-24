package domain.DAOs;

import domain.Buildings;
import domain.Machinery;
import domain.interfaces.IMachineryDao;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.sql.*;
import java.util.List;

@XmlRootElement(name = "MachineryDAO")
public class MachineryDAO implements IMachineryDao {
    @Override
    public Machinery getById(int id) throws SQLException {
        String query = "select * from machinery where id = ?";
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/Facundo_Panichelli", "root", "devintern" );
        try(PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, 3);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Machinery(resultSet.getInt("id"), resultSet.getString("license_plate"), resultSet.getString("model"),
                    resultSet.getString("type"), resultSet.getInt("operators_id"));
        } catch (SQLException e){
            throw new SQLException();
        }
    }

    @Override
    public void save(Machinery machinery) throws SQLException {

    }

    @Override
    public void update(Machinery machinery, String[] params) {

    }

    @Override
    public void delete(Machinery machinery) {

    }

    @Override
    public List<Machinery> selectAll() throws SQLException {
        return null;
    }
}
