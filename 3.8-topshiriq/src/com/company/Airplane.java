package com.company;

import java.util.Random;

public class Airplane extends Transport implements Vehicle {
    private String model;
    private int passengers;
    private String type;

    public Airplane() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("----> Airplane started !!!");
    }

    @Override
    public void stop() {
        System.out.println("----> Airplane stopped !!!");
    }

    @Override
    public void Show() {
        System.out.println("----> Airplane Information <----");
        System.out.println("----> Airplane Color: " + this.getColor());
        System.out.println("----> Airplane Company: " + this.getCompany());
        System.out.println("----> Airplane Fuel type: " + this.getFuelType());
        System.out.println("----> Airplane Model: " + this.getModel());
        System.out.println("----> Airplane Passengers: " + this.getPassengers());
        System.out.println("----> Airplane Type: " + this.getType());
    }

    @Override
    public void takeoff() {
        System.out.println("----> Airplane flown !!!");
    }

    @Override
    public int checkSpeed() {
        Random random = new Random();
        return random.nextInt(+250) + 450;
    }
}
