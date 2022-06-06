package com.solvd.BuildingCompany.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Architect {

    private int id;
    private String firstName;
    private String lastName;
    private int buildingsId;

    public Architect() {
    }

    public Architect(int id, String firstName, String lastName, int buildingsId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.buildingsId = buildingsId;
    }


    public Architect(String first_name, String last_name, Integer buildings_id) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.buildingsId = buildings_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBuildingsId() {
        return buildingsId;
    }

    public void setBuildingsId(int buildingsId) {
        this.buildingsId = buildingsId;
    }

    @Override
    public String toString() {
        return "\n" + "Architect{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", buildingsId=" + buildingsId +
                '}' + "\n";
    }
}


