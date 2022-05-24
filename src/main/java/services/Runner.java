package services;

import domain.DAOs.BuildingsDAO;

import java.sql.SQLException;

public class Runner {

    public static void main(String[] args) throws SQLException {
        BuildingsDAO bd = new BuildingsDAO();
        System.out.println(bd.getById(3));
    }
}
