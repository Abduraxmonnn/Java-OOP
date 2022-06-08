package com.company;

import java.util.Random;

public class Car extends Transport implements Vehicle {
    private String model;
    private double price;
    private double consumption;

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public void start() {
        System.out.println("----> The car started !!!");
    }

    @Override
    public void stop() {
        System.out.println("----> The car stop !!!");
    }

    @Override
    public void Show() {
        System.out.println("----> Car Information <----");
        System.out.println("----> Car Color:" + this.getColor());
        System.out.println("----> Car Company: " + this.getCompany());
        System.out.println("----> Car fuel type: " + this.getFuelType());
        System.out.println("----> Car Model: " + this.getModel());
        System.out.println("----> Car price: " + this.getPrice());
        System.out.println("----> Car consumption: " + this.getConsumption());
    }

    @Override
    public int checkSpeed() {
        Random random = new Random();
        return random.nextInt(65) + 65;
    }
}
