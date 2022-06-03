package domain;

import domain.interfaces.IArchitectDao;

import java.sql.SQLException;
import java.util.List;

public class Architect implements IArchitectDao {

    private int id;
    private String firstName;
    private String lastName;
    private int buildingsId;
    private int buildingsConstructionLotId;
    private int buildingsProjectId;
    private int buildingsSupervisorId;

    public Architect(int id, String firstName, String lastName, int buildingsId, int buildingsConstructionLotId, int buildingsProjectId, int buildingsSupervisorId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.buildingsId = buildingsId;
        this.buildingsConstructionLotId = buildingsConstructionLotId;
        this.buildingsProjectId = buildingsProjectId;
        this.buildingsSupervisorId = buildingsSupervisorId;
    }


    public Architect(int id, String first_name, String last_name, int buildings_id) {

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

    public int getBuildingsConstructionLotId() {
        return buildingsConstructionLotId;
    }

    public void setBuildingsConstructionLotId(int buildingsConstructionLotId) {
        this.buildingsConstructionLotId = buildingsConstructionLotId;
    }

    public int getBuildingsProjectId() {
        return buildingsProjectId;
    }

    public void setBuildingsProjectId(int buildingsProjectId) {
        this.buildingsProjectId = buildingsProjectId;
    }

    public int getBuildingsSupervisorId() {
        return buildingsSupervisorId;
    }

    public void setBuildingsSupervisorId(int buildingsSupervisorId) {
        this.buildingsSupervisorId = buildingsSupervisorId;
    }

    @Override
    public IArchitectDao getById(int i) throws SQLException {
        return null;
    }

    @Override
    public void insert(IArchitectDao iArchitectDao) throws SQLException {

    }

    @Override
    public void update(IArchitectDao iArchitectDao, String[] params) {

    }


    @Override
    public List<IArchitectDao> selectAll() throws SQLException {
        return null;
    }

    @Override
    public String toString() {
        return "Architect{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", buildingsId=" + buildingsId +
                ", buildingsConstructionLotId=" + buildingsConstructionLotId +
                ", buildingsProjectId=" + buildingsProjectId +
                ", buildingsSupervisorId=" + buildingsSupervisorId +
                '}';
    }
}
