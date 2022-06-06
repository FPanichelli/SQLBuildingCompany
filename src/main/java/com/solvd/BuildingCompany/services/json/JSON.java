package com.solvd.BuildingCompany.services.json;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.BuildingCompany.domain.Supervisor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSON {
    private static Logger LOGGER = LogManager.getLogger(JSON.class);
    private static ObjectMapper om = new ObjectMapper();

    public void marshallSupervisor(List<Supervisor> supervisors) {
        try {
            om.writeValue(new File("src/main/resources/supervisor.json"), supervisors);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void unmarshallSupervisor() {
        File file = new File("src/main/resources/supervisor.json");
        JavaType type = om.getTypeFactory().constructCollectionType(List.class, Supervisor.class);
        try {
            List<Supervisor> supervisors = om.readValue(file, type);
            supervisors.forEach(supervisor -> LOGGER.info(supervisor));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
