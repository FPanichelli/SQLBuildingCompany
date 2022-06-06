package com.solvd.BuildingCompany.DAOs.interfaces;

import com.solvd.BuildingCompany.domain.Builders;

import java.sql.SQLException;
import java.util.List;

public interface IBuildersDao extends IBaseDao<Builders> {
    void update(int id, Builders builderUpdate) throws SQLException;

    void insert(Builders builderInsert) throws SQLException;

    List<Builders> selectAll() throws SQLException;

    void delete(int id) throws SQLException;
}
