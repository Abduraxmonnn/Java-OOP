package com.company;

public class Car {
    private String model;
    private String company;
    private String color;
    private int speed;
    private double consumption;
    Driver driver;

    public Car() {
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.driver = new Driver();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public boolean checkDriver() {
        return this.getDriver().getName() != null;
    }

    public void Show() {
        if (checkDriver()) {
            System.out.println("************* Car information *************");
            System.out.println("--> Car model: " + this.getModel());
            System.out.println("--> Car brand: " + this.getCompany());
            System.out.println("--> Car color: " + this.getColor());
            System.out.println("--> Car speed: " + this.getSpeed());
            System.out.println("--> Car conception: " + this.getConsumption());
            System.out.println("\n------------------- Vehicle driver information -------------------");
            this.driver.Show();
        } else {
            System.out.println("-----------> There is not vehicle driver information!!!");
        }
    }
}
