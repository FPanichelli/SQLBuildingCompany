package com.solvd.BuildingCompany.domain;

public class ConstructionCrew {

    private int id;
    private int crewSize;
    private int lotId;
    private int projectId;
    private int projectSupervisorId;
    private int transportTruckId;
    private int operatorsId;

    public ConstructionCrew(int id, int crewSize, int lotId, int projectId, int projectSupervisorId, int transportTruckId, int operatorsId) {
        this.id = id;
        this.crewSize = crewSize;
        this.lotId = lotId;
        this.projectId = projectId;
        this.projectSupervisorId = projectSupervisorId;
        this.transportTruckId = transportTruckId;
        this.operatorsId = operatorsId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectSupervisorId() {
        return projectSupervisorId;
    }

    public void setProjectSupervisorId(int projectSupervisorId) {
        this.projectSupervisorId = projectSupervisorId;
    }

    public int getTransportTruckId() {
        return transportTruckId;
    }

    public void setTransportTruckId(int transportTruckId) {
        this.transportTruckId = transportTruckId;
    }

    public int getOperatorsId() {
        return operatorsId;
    }

    public void setOperatorsId(int operatorsId) {
        this.operatorsId = operatorsId;
    }
}
