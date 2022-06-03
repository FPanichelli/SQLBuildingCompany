package services.mybatis;

import domain.Builders;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.mybatis.services.ServiceBuilders;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.List;

public class MyBatisRunner {

    private static Logger LOGGER = LogManager.getLogger(MyBatisRunner.class);

    public static void main(String[] args) throws SQLException {
        ServiceBuilders builders = new ServiceBuilders();
        /*List<Builders> buildersList = builders.selectAll();
        buildersList.stream().forEach(builder -> LOGGER.info(builder));*/
        builders.delete(11);

        LOGGER.info(builders.getById(1));
        LOGGER.info(builders.getById(2));
        LOGGER.info(builders.getById(3));
        LOGGER.info(builders.getById(4));
        LOGGER.info(builders.getById(5));
        LOGGER.info(builders.getById(6));
        LOGGER.info(builders.getById(7));
        LOGGER.info(builders.getById(8));
        LOGGER.info(builders.getById(9));
        LOGGER.info(builders.getById(10));

        builders.insert(new Builders(11, "Alejandro", "Pappuzzi", 2));
        LOGGER.info(builders.getById(11));
        builders.update(11, new Builders(11, "Ricardo", "Sape", 2));
        LOGGER.info(builders.getById(11));
    }
}
