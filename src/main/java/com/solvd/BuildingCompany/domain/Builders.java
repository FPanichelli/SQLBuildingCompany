package com.solvd.BuildingCompany.domain;


import com.solvd.BuildingCompany.DAOs.interfaces.IBuildersDao;

import java.sql.SQLException;
import java.util.List;

public class Builders implements IBuildersDao {

    private int id;
    private String firstName;
    private String lastName;
    private int constructionCrewId;

    public Builders() {
    }

    public Builders(int id, String firstName, String lastName, int constructionCrewId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.constructionCrewId = constructionCrewId;
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

    public int getConstructionCrewId() {
        return constructionCrewId;
    }

    public void setConstructionCrewId(int constructionCrewId) {
        this.constructionCrewId = constructionCrewId;
    }

    @Override
    public String toString() {
        return "Builders{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", constructionCrewId=" + constructionCrewId + '}';
    }

    @Override
    public Builders getById(int i) throws SQLException {
        return null;
    }


    @Override
    public void delete(int builders) throws SQLException {

    }


    @Override
    public void update(int id, Builders builderUpdate) throws SQLException {

    }

    @Override
    public void insert(Builders builderInsert) throws SQLException {

    }

    @Override
    public List<Builders> selectAll() throws SQLException {
        return null;
    }

}
