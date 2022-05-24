package domain;

public class ClientPayment {

    private int id;
    private int projectId;
    private int clientId;
    private int supervisorId;

    public ClientPayment(int id, int projectId, int clientId, int supervisorId) {
        this.id = id;
        this.projectId = projectId;
        this.clientId = clientId;
        this.supervisorId = supervisorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }
}
