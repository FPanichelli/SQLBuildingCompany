package services.mybatis;

import domain.Builders;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.List;

public interface IServiceBuilders {

    Builders getById(int id);

    List<Builders> selectAll() throws SQLFeatureNotSupportedException;

    void insert(Builders builders);

    void update(int id, Builders builderUpdate);

    void delete(int id) throws SQLException;
}
