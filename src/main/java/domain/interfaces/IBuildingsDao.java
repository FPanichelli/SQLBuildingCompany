package domain.interfaces;

import domain.Buildings;

import java.sql.SQLException;

public interface IBuildingsDao extends IBaseDao <Buildings>{

    void delete(Buildings buildings) throws SQLException;
}
