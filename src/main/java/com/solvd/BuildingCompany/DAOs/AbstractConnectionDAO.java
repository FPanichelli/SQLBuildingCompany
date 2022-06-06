package com.solvd.BuildingCompany.DAOs;

import com.solvd.BuildingCompany.utils.ConnectionPool;

import java.net.ConnectException;
import java.sql.Connection;

public abstract class AbstractConnectionDAO {

    public Connection getConnection() throws ConnectException {
        return ConnectionPool.getInstance().getConnection();
    }

    public void returnConnection(Connection connection) {
        ConnectionPool.getInstance().returnConnection(connection);
    }
}
