package main;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void carStatus() {
        System.out.println("Auto: " + brand + " " + model + ", Nopeus: " + speed + " km/h");
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

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int acceleration) {
        speed += acceleration;
    }

    public void decelerate(int deceleration) {
        speed -= deceleration;
        if (speed < 0) {
            speed = 0;
        }
    }
}
