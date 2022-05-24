package domain;

public class Buildings {
    private int id;
    private String type;
    private int stories;
    private int constructionLotId;
    private int projectId;
    private int supervisorId;

    public Buildings(int id, String type, int stories, int constructionLotId, int projectId, int supervisorId) {
        this.id = id;
        this.type = type;
        this.stories = stories;
        this.constructionLotId = constructionLotId;
        this.projectId = projectId;
        this.supervisorId = supervisorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }

    public int getConstructionLotId() {
        return constructionLotId;
    }

    public void setConstructionLotId(int constructionLotId) {
        this.constructionLotId = constructionLotId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }

    @Override
    public String toString() {
        return "Buildings{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", stories=" + stories +
                ", constructionLotId=" + constructionLotId +
                ", projectId=" + projectId +
                ", supervisorId=" + supervisorId +
                '}';
    }
}
