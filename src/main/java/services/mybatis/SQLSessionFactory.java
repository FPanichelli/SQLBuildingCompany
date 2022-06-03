package services.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.Reader;

public class SQLSessionFactory {
    private static final Logger LOGGER = LogManager.getLogger(SQLSessionFactory.class);
    private static SQLSessionFactory INSTANCE;
    private static SqlSessionFactory FACTORY;

    private SQLSessionFactory() {
        String resource = "mybatis-config.xml";
        Reader reader = null;

        try {
            reader = Resources.getResourceAsReader(resource);
            FACTORY = new SqlSessionFactoryBuilder().build(reader);
            reader.close();

        } catch (IOException e) {
            LOGGER.error(e);
        }
    }

    public static SQLSessionFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SQLSessionFactory();
        }
        return INSTANCE;
    }

    public static SqlSessionFactory getFactory() {
        return FACTORY;
    }
}

