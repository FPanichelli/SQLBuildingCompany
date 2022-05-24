package domain;

public class Foreman {

    private int id;
    private String firstName;
    private String lastName;
    private int constructionCrewId;

    public Foreman(int id, String firstName, String lastName, int constructionCrewId) {
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
}
