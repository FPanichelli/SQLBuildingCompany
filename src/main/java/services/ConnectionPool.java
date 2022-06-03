package services;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionPool {
    private static BasicDataSource dataSource = null;

    static {
        dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://52.59.193.212:3306/Facundo_Panichelli");
        dataSource.setUsername("root");
        dataSource.setPassword("devintern");

        dataSource.setMinIdle(5);
        dataSource.setMaxIdle(10);
        dataSource.setMaxTotal(25);

    }

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from client");
            while (resultSet.next()) {
                System.out.println("\n"+"Client id: " + resultSet.getInt("id"));
                System.out.println("First Name: " + resultSet.getString("first_name"));
                System.out.println("Last Name: " + resultSet.getString("last_name"));
                System.out.println("Phone Number: " + resultSet.getString("phone_number"));
                System.out.println("Supervisor: " + resultSet.getInt("supervisor_id"));
            }
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
    }
}
