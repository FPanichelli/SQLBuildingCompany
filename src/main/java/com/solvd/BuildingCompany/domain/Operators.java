package com.solvd.BuildingCompany.domain;

public class Operators {

    private int id;
    private int builderId;
    private String licenseExp;

    public Operators(int id, int builderId, String licenseExp) {
        this.id = id;
        this.builderId = builderId;
        this.licenseExp = licenseExp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuilderId() {
        return builderId;
    }

    public void setBuilderId(int builderId) {
        this.builderId = builderId;
    }

    public String getLicenseExp() {
        return licenseExp;
    }

    public void setLicenseExp(String licenseExp) {
        this.licenseExp = licenseExp;
    }
}
