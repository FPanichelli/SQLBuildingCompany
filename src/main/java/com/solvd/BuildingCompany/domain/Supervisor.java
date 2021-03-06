package com.solvd.BuildingCompany.domain;

public class Supervisor {

    private int id;
    private String firstName;
    private String lastName;
    private int clientId;

    public Supervisor(int id, String firstName, String lastName, int clientId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientId = clientId;
    }

    public Supervisor() {
    }

    public Supervisor(String first_name, String last_name, Integer client_id) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.clientId = client_id;
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

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Supervisor{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", clientId=" + clientId + '}';
    }
}
