package com.solvd.BuildingCompany.utils.builders;

import com.solvd.BuildingCompany.domain.Architect;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ArchitectBuilder {
    private static Logger LOG = LogManager.getLogger(ArchitectBuilder.class);

    public Architect build() {
        Scanner abs = new Scanner(System.in);
        Architect ar = new Architect();

        LOG.info("insert First Name");
        ar.setFirstName(abs.next());
        LOG.info("insert Last Name");
        ar.setLastName(abs.next());
        LOG.info("insert Building ID:");
        ar.setBuildingsId(abs.nextInt());

        return ar;
    }
}