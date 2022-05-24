package domain;

public class SoldApartments {

    private int id;
    private String address;
    private int floor;
    private String apartment;
    private int clientId;
    private int clientSupervisorId;

    public SoldApartments(int id, String address, int floor, String apartment, int clientId, int clientSupervisorId) {
        this.id = id;
        this.address = address;
        this.floor = floor;
        this.apartment = apartment;
        this.clientId = clientId;
        this.clientSupervisorId = clientSupervisorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getClientSupervisorId() {
        return clientSupervisorId;
    }

    public void setClientSupervisorId(int clientSupervisorId) {
        this.clientSupervisorId = clientSupervisorId;
    }
}
