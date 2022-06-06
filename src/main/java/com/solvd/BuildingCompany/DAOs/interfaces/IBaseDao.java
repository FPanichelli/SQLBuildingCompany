package com.solvd.BuildingCompany.DAOs.interfaces;

import com.solvd.BuildingCompany.utils.exceptions.DAOException;

import java.net.ConnectException;
import java.sql.SQLException;
import java.util.List;

public interface IBaseDao<T> {

    T getById(int i) throws SQLException, DAOException, ConnectException;

    void insert(T t) throws SQLException, DAOException, ConnectException;

    void update(int id, T t) throws SQLException, DAOException, ConnectException;

    void delete(int t) throws SQLException, DAOException, ConnectException;

    List<T> selectAll() throws SQLException, DAOException, ConnectException;
}
