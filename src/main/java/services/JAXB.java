package services;

import domain.Machinery;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.FileOutputStream;
import java.io.IOException;

public class JAXB {

    public static void main(String[] args) {
        try {
            Machinery machine = new Machinery(5, "LTA-222", "CAT W2", "Bulldozer", 2);
            JAXBContext c = JAXBContext.newInstance(Machinery.class);
            Marshaller m = c.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(machine, new FileOutputStream("src/main/resources/JAXB.xml"));
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }

    }
}
