package com.company;

import java.util.Random;

public class Bus extends Transport implements Vehicle{
    private String model;
    private double price;
    private double consumption;

    public Bus() {

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
        System.out.println("----> The bus started !!!");
    }

    @Override
    public void stop() {
        System.out.println("----> The bus stop !!!");
    }

    @Override
    public void Show() {
        System.out.println("----> Bus Information <----");
        System.out.println("----> Bus Color:"+this.getColor());
        System.out.println("----> Bus Company: "+this.getCompany());
        System.out.println("----> Bus fuel type: "+this.getFuelType());
        System.out.println("----> Bus Model: "+this.getModel());
        System.out.println("----> Bus price: "+this.getPrice());
        System.out.println("----> Bus consumption: "+this.getConsumption());
    }

    @Override
    public int checkSpeed() {
        Random random = new Random();
        return random.nextInt(35)+10;
    }
}
