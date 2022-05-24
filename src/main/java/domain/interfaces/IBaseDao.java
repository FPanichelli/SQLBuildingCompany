package domain.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface IBaseDao<T> {

    T getById(int i) throws SQLException;

    void save(T t) throws SQLException;

    void update(T t, String[] params);

    void delete(T t);

    List<T> selectAll() throws SQLException;
}
