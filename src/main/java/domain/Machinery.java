package domain;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Machinery")
public class Machinery {

    private int id;
    private String licensePlate;
    private String model;
    private String type;
    private int operatorId;

    public Machinery(int id, String licensePlate, String model, String type, int operatorId) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.model = model;
        this.type = type;
        this.operatorId = operatorId;
    }

    public Machinery() {
    }

    public int getId() {
        return id;
    }
    @XmlAttribute(name = "id")
    public void setId(int id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    @XmlElement(name = "plate")
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }
    @XmlElement(name = "model")
    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }
    @XmlElement(name = "type")
    public void setType(String type) {
        this.type = type;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    @Override
    public String toString() {
        return "Machinery{" +
                "id=" + id +
                ", licensePlate='" + licensePlate + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", operatorId=" + operatorId +
                '}';
    }
}
