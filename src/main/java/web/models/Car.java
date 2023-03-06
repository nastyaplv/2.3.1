package web.models;

public class Car {
private int id;
private String model;
private String motor;

    public Car(int id, String model, String motor) {
        this.id = id;
        this.model = model;
        this.motor = motor;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getMotor() {
        return motor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
