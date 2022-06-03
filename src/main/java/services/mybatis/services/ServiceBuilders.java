package services.mybatis.services;

import domain.Builders;
import domain.interfaces.IBuildersDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.json.JSON;
import services.mybatis.IServiceBuilders;
import utils.DBPropertiesUtil;
import utils.IDBC;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ServiceBuilders implements IServiceBuilders {

    private static Logger LOGGER = LogManager.getLogger(ServiceBuilders.class);

    private final static String MYBATIS_CONFIG = DBPropertiesUtil.getINSTANCE().getString(IDBC.MYBATIS_CONFIG);

    @Override
    public Builders getById(int id) {
        IBuildersDao buildersDAO;
        Builders b;
        try {
            Reader reader = Resources.getResourceAsReader(MYBATIS_CONFIG);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            buildersDAO = sqlSessionFactory.openSession().getMapper(IBuildersDao.class);
            b = (Builders) buildersDAO.getById(id);
        } catch (IOException | SQLException e) {
            LOGGER.info("Select statement failed" + e);
            throw new RuntimeException(e);
        }
        return b;
    }

    @Override
    public List<Builders> selectAll() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("not implemented");
    }

    /*@Override
    public List<Builders> selectAll() {
        IBuildersDao buildersDAO;
        List<Builders> buildersList;
        try{
            Reader reader = Resources.getResourceAsReader(MYBATIS_CONFIG);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            buildersDAO = sqlSessionFactory.openSession().getMapper(IBuildersDao.class);
            buildersList = new ArrayList<>();
            buildersList = buildersDAO.selectAll();
        } catch (IOException | SQLException e ) {
            LOGGER.info("Select statement failed" + e);
            throw new RuntimeException(e);
        }
        return buildersList;
    }*/

    @Override
    public void insert(Builders builders) {
        IBuildersDao buildersDAO;
        try {
            Reader reader = Resources.getResourceAsReader(MYBATIS_CONFIG);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            buildersDAO = session.getMapper(IBuildersDao.class);
            buildersDAO.insert(builders);
            session.commit();
        } catch (IOException | SQLException e) {
            LOGGER.info("Insert statement failed" + e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(int id, Builders builderUpdate) {
        IBuildersDao buildersDAO;
        try {
            Reader reader = Resources.getResourceAsReader(MYBATIS_CONFIG);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            buildersDAO = session.getMapper(IBuildersDao.class);
            builderUpdate.setId(id);
            buildersDAO.update(builderUpdate);
            session.commit();
        } catch (IOException | SQLException e) {
            LOGGER.info("Update statement failed" + e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        IBuildersDao buildersDAO;
        try{
            Reader reader = Resources.getResourceAsReader(MYBATIS_CONFIG);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            buildersDAO = session.getMapper(IBuildersDao.class);
            buildersDAO.delete(id);
            session.commit();
        } catch (IOException | SQLException e) {
            LOGGER.info("Delete statement failed" + e);
            throw new RuntimeException();
        }
    }

}
