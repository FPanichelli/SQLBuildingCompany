package com.solvd.BuildingCompany.services.jaxb;

import com.solvd.BuildingCompany.domain.Machinery;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JAXB {

    private static Logger LOGGER = LogManager.getLogger(JAXB.class);

    public Machinery jaxbMarshall(Machinery machine) throws JAXBException, FileNotFoundException {
        try {
            JAXBContext c = JAXBContext.newInstance(Machinery.class);
            Marshaller m = c.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(machine, new FileOutputStream("src/main/resources/JAXB.xml"));
            LOGGER.info("Marshalling successful");
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return machine;
    }

    public Machinery jaxbUnmarshall(Machinery machine) throws JAXBException, FileNotFoundException {
        try {
            JAXBContext context = JAXBContext.newInstance(Machinery.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Machinery machine2 = (Machinery) unmarshaller.unmarshal(new File("src/main/resources/JAXB.xml"));
            LOGGER.info("Unmarshalling file:");
            LOGGER.info(machine2);
        } catch (JAXBException exception) {
            exception.printStackTrace();
        }
        return machine;
    }
}
