package com.solvd.BuildingCompany.domain;

public class Provider {

    private int id;
    private String companyName;
    private String material;
    private int price;
    private int projectId;
    private int transportTruckId;

    public Provider(int id, String companyName, String material, int price, int projectId, int transportTruckId) {
        this.id = id;
        this.companyName = companyName;
        this.material = material;
        this.price = price;
        this.projectId = projectId;
        this.transportTruckId = transportTruckId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getTransportTruckId() {
        return transportTruckId;
    }

    public void setTransportTruckId(int transportTruckId) {
        this.transportTruckId = transportTruckId;
    }
}
