package com.solvd.BuildingCompany.domain;

public class ConstructionLot {

    private int id;
    private int buildingId;
    private int squareFootage;
    private int projectId;

    public ConstructionLot(int id, int buildingId, int squareFootage, int projectId) {
        this.id = id;
        this.buildingId = buildingId;
        this.squareFootage = squareFootage;
        this.projectId = projectId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
}
