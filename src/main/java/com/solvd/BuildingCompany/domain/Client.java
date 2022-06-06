package com.solvd.BuildingCompany.domain;

import com.solvd.BuildingCompany.DAOs.interfaces.IClientDao;

import java.sql.SQLException;
import java.util.List;

public class Client implements IClientDao {

    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int paymentId;
    private int budget;
    private int supervisorId;

    public Client(int id, String firstName, String lastName, String phoneNumber, int paymentId, int budget, int supervisorId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.paymentId = paymentId;
        this.budget = budget;
        this.supervisorId = supervisorId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }

    @Override
    public Client getById(int i) throws SQLException {
        return null;
    }

    @Override
    public void insert(Client client) throws SQLException {

    }

    @Override
    public void update(int id, Client client) {

    }

    @Override
    public void delete(int t) throws SQLException {

    }

    @Override
    public List<Client> selectAll() throws SQLException {
        return null;
    }
}
