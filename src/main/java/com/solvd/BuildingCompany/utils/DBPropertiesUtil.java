package com.solvd.BuildingCompany.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DBPropertiesUtil {

    private static Logger LOGGER = LogManager.getLogger(DBPropertiesUtil.class);
    private final static Properties PROPERTIES = new Properties();

    public static DBPropertiesUtil INSTANCE = new DBPropertiesUtil();

    private DBPropertiesUtil() {
        try {
            PROPERTIES.load(new FileReader(new File("src/main/resources/db.properties")));
        } catch (IOException e) {
            LOGGER.error("Properties not read", e);
        }
    }

    public static String getString(String key) {
        return PROPERTIES.getProperty(key);
    }

    public static int getInt(String key) {
        return Integer.parseInt(PROPERTIES.getProperty(key));
    }

    public static DBPropertiesUtil getINSTANCE() {
        return INSTANCE;
    }
}
