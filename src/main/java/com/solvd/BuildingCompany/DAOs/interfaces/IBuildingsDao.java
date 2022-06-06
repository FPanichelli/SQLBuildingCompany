package com.solvd.BuildingCompany.DAOs.interfaces;

import com.solvd.BuildingCompany.domain.Buildings;

import java.sql.SQLException;

public interface IBuildingsDao extends IBaseDao<Buildings> {

    void delete(Buildings buildings) throws SQLException;
}
