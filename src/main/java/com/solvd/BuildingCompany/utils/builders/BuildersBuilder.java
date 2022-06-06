package com.solvd.BuildingCompany.utils.builders;

import com.solvd.BuildingCompany.domain.Builders;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class BuildersBuilder {
    private static Logger LOG = LogManager.getLogger(BuildersBuilder.class);

    public Builders build() {
        Scanner abs = new Scanner(System.in);
        Builders b = new Builders();

        LOG.info("insert First Name");
        b.setFirstName(abs.next());
        LOG.info("insert Last Name");
        b.setLastName(abs.next());
        LOG.info("insert Construction Crew ID:");
        b.setConstructionCrewId(abs.nextInt());

        return b;
    }
}
