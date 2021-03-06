package com.solvd.BuildingCompany;

import com.solvd.BuildingCompany.DAOs.ArchitectDAO;
import com.solvd.BuildingCompany.DAOs.BuildersDAO;
import com.solvd.BuildingCompany.DAOs.MachineryDAO;
import com.solvd.BuildingCompany.DAOs.SupervisorDAO;
import com.solvd.BuildingCompany.domain.Architect;
import com.solvd.BuildingCompany.domain.Builders;
import com.solvd.BuildingCompany.domain.Machinery;
import com.solvd.BuildingCompany.domain.Supervisor;
import com.solvd.BuildingCompany.services.jaxb.JAXB;
import com.solvd.BuildingCompany.services.json.JSON;
import com.solvd.BuildingCompany.utils.builders.ArchitectBuilder;
import com.solvd.BuildingCompany.utils.builders.BuildersBuilder;
import com.solvd.BuildingCompany.utils.exceptions.DAOException;
import jakarta.xml.bind.JAXBException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.net.ConnectException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Runner {
    private static Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) throws DAOException, SQLException, ConnectException, JAXBException, FileNotFoundException {
        ArchitectDAO architect = new ArchitectDAO();
        BuildersDAO builders = new BuildersDAO();
        MachineryDAO machinery = new MachineryDAO();
        SupervisorDAO supervisor = new SupervisorDAO();

        JAXB jaxb = new JAXB();
        JSON json = new JSON();

        LOGGER.info("Hello! And thanks for trusting in Safe Quick Lofting building company, for your building needs");
        LOGGER.info("What would you like to check?" + "\n"
                + "1. Architects" + "\n"
                + "2. Builders" + "\n"
                + "3. Supervisors" + "\n"
                + "4. Machinery");

        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                LOGGER.info("What would you like to do with Architects?" + "\n"
                        + "1. Check an architect through their ID" + "\n"
                        + "2. Check all registered architects" + "\n"
                        + "3. Insert new architect in database" + "\n"
                        + "4. Update an architect in database" + "\n"
                        + "5. Delete an architect");

                Scanner sc2 = new Scanner(System.in);
                choice = sc2.nextInt();

                switch (choice) {
                    case 1:
                        int id;
                        LOGGER.info("Please provide architect ID:");
                        id = sc2.nextInt();
                        LOGGER.info(architect.getById(id));
                        break;

                    case 2:
                        LOGGER.info("Printing list for Architects table");
                        LOGGER.info(architect.selectAll());
                        break;

                    case 3:
                        ArchitectBuilder ab = new ArchitectBuilder();
                        LOGGER.info("Please provide information on new architect:");
                        Architect ar = ab.build();
                        architect.insert(ar);
                        break;

                    case 4:
                        int id2;
                        ArchitectBuilder ab2 = new ArchitectBuilder();
                        LOGGER.info("Please provide ID of architect to be updated:");
                        id2 = sc2.nextInt();
                        Architect ar2 = ab2.build();
                        architect.update(id2, ar2);
                        break;

                    case 5:
                        int id3;
                        LOGGER.info("Please provide architect id to delete from table:");
                        id3 = sc2.nextInt();
                        architect.delete(id3);
                        break;
                }
                break;

            case 2:
                LOGGER.info("What would you like to do with Builders?" + "\n"
                        + "1. Check a builder through their ID" + "\n"
                        + "2. Check all registered builders" + "\n"
                        + "3. Insert new builder in database" + "\n"
                        + "4. Update a builder in database" + "\n"
                        + "5. Delete a builder");

                Scanner sc3 = new Scanner(System.in);
                choice = sc3.nextInt();

                switch (choice) {

                    case 1:
                        int id;
                        LOGGER.info("Please provide builder ID:");
                        id = sc3.nextInt();
                        LOGGER.info(builders.getById(id));
                        break;

                    case 2:
                        LOGGER.info("Printing list for Builders table");
                        LOGGER.info(builders.selectAll());
                        break;

                    case 3:
                        BuildersBuilder b = new BuildersBuilder();
                        LOGGER.info("Please provide information on new builder:");
                        Builders bu = b.build();
                        builders.insert(bu);
                        break;

                    case 4:
                        int id2;
                        BuildersBuilder b2 = new BuildersBuilder();
                        LOGGER.info("Please provide ID of architect to be updated:");
                        id2 = sc3.nextInt();
                        Builders bu2 = b2.build();
                        builders.update(id2, bu2);
                        break;

                    case 5:
                        int id3;
                        LOGGER.info("Please provide architect id to delete from table:");
                        id3 = sc3.nextInt();
                        builders.delete(id3);
                        break;
                }
                break;

            case 3:
                LOGGER.info("Selecting all rows on supervisor table and marshalling to JSON file");
                List<Supervisor> sl = supervisor.selectAll();
                json.marshallSupervisor(sl);
                LOGGER.info("Printing from JSON file:");
                json.unmarshallSupervisor();
                break;

            case 4:
                LOGGER.info("Select Machinery id to marshall then unmarshall");
                int machinery_id;
                machinery_id = sc.nextInt();
                Machinery m = machinery.getById(machinery_id);
                jaxb.jaxbMarshall(m);
                Machinery m2 = new Machinery();
                jaxb.jaxbUnmarshall(m2);
                break;
        }
    }
}
