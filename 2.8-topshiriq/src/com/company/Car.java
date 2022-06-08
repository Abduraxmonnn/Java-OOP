package com.company;

public class Car {
    public String model;
    public String company;
    public double price;
    public String color;
    public int speed;
    public String agreementNumber;

    public Car() {

    }

    public Car(String model, String company) {
        this.model = model;
        this.company = company;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public String getAgreementNumber() {
        return agreementNumber;
    }

    public void setAgreementNumber(String agreementNumber) {
        this.agreementNumber = agreementNumber;
    }

    public void Show() {
        System.out.println("----- Car Information -----");
        System.out.println("---> Car model: " + this.getModel());
        System.out.println("---> Car company: " + this.getCompany());
        System.out.println("---> Car cost: " + this.getPrice() + "$");
        System.out.println("---> Car color: " + this.getColor());
        System.out.println("---> Car speed: " + this.getSpeed());
        System.out.println("---> Car agreement number: " + this.getAgreementNumber());
    }
}
