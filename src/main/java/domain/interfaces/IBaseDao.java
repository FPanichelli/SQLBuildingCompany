package domain.interfaces;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.List;

public interface IBaseDao<T> {

    T getById(int i) throws SQLException;

    void insert(T t) throws SQLException;

    void update(T t, String[] params) throws SQLFeatureNotSupportedException;

    //void delete(int t) throws SQLException;

    List<T> selectAll() throws SQLException;
}
