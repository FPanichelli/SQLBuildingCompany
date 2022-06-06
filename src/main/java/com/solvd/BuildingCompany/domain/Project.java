package com.solvd.BuildingCompany.domain;

public class Project {

    private int id;
    private int architectId;
    private int providerId;
    private int crewId;
    private int lotIdId;
    private int buildingId;
    private String price;
    private int supervisorId;

    public Project(int id, int architectId, int providerId, int crewId, int lotIdId, int buildingId, String price, int supervisorId) {
        this.id = id;
        this.architectId = architectId;
        this.providerId = providerId;
        this.crewId = crewId;
        this.lotIdId = lotIdId;
        this.buildingId = buildingId;
        this.price = price;
        this.supervisorId = supervisorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArchitectId() {
        return architectId;
    }

    public void setArchitectId(int architectId) {
        this.architectId = architectId;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public int getCrewId() {
        return crewId;
    }

    public void setCrewId(int crewId) {
        this.crewId = crewId;
    }

    public int getLotIdId() {
        return lotIdId;
    }

    public void setLotIdId(int lotIdId) {
        this.lotIdId = lotIdId;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }
}
