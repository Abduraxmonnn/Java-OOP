package com.company;

import java.util.Random;

public class Airplane extends Transport implements Vehicle{
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
        System.out.println("----> Samalyot harakatga tushdi !!!");
    }

    @Override
    public void stop() {
        System.out.println("----> Samalyot qo'ndi !!!");
    }

    @Override
    public void Show() {
        System.out.println("----> Samalyot ma'lumotlari <----");
        System.out.println("----> Color: "+this.getColor());
        System.out.println("----> Company: "+this.getCompany());
        System.out.println("----> Fuel type: "+this.getFuelType());
        System.out.println("----> Model: "+this.getModel());
        System.out.println("----> Passengers: "+this.getPassengers());
        System.out.println("----> Type: "+this.getType());
    }

    @Override
    public void takeoff() {
        System.out.println("----> Samalyot uchdi !!!");
    }

    @Override
    public int checkSpeed() {
        Random random = new Random();
        return random.nextInt(+250)+450;
    }
}
