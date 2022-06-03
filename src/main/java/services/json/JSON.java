package services.json;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Supervisor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSON {
    private static Logger LOGGER = LogManager.getLogger(JSON.class);
    private static ObjectMapper om = new ObjectMapper();
    private static Supervisor supervisor = new Supervisor(5, "Craig", "Pelton", 5);
    private static Supervisor supervisor2 = new Supervisor(6, "Ben", "Chang", 6);

    public void setSupervisor() {
        try {
            om.writeValue(new File("src/main/resources/supervisor.json"), supervisor);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void jsonPrinter() {
        File file = new File("src/main/resources/supervisor.json");
        JavaType type = om.getTypeFactory().constructCollectionType(List.class, Supervisor.class);
        try {
            List<Supervisor> supervisors = om.readValue(file, type);
            supervisors.forEach(supervisor -> LOGGER.info(supervisor));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        JSON json = new JSON();

        json.jsonPrinter();
    }
}
