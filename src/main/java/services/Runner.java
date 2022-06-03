package services;

import DAOs.ArchitectDAO;
import DAOs.BuildingsDAO;
import DAOs.ClientsDAO;
import DAOs.MachineryDAO;
import domain.Buildings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.json.JSON;

import java.sql.SQLException;
import java.util.Scanner;

public class Runner {

    private static Logger LOGGER = LogManager.getLogger(JSON.class);

    public static void main(String[] args) throws SQLException {

        LOGGER.info("Hello and thanks for trusting Safe, Quick and Lofty building company for your construction needs");
        LOGGER.info("Please provide us with an ID to know the building over which you're consulting us today");

        BuildingsDAO building = new BuildingsDAO();
        ArchitectDAO architect = new ArchitectDAO();
        ClientsDAO clients = new ClientsDAO();
        MachineryDAO machineryDAO = new MachineryDAO();

        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();

        LOGGER.info("Now displaying information for Building with id " + choice + ": ");
        LOGGER.info(building.getById(choice));

        LOGGER.info("choose an architect ID to check their information: ");
        choice = sc.nextInt();
        LOGGER.info("Now displaying information for Architect with id " + choice + ": ");
        LOGGER.info(architect.getById(choice));

        building.insert(new Buildings(5, "residential", 16, 5, 5, 5));


    }
}
