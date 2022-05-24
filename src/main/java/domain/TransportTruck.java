package domain;

public class TransportTruck {

    private int id;
    private String brand;
    private String model;
    private int providerId;

    public TransportTruck(int id, String brand, String model, int providerId) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.providerId = providerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }
}
