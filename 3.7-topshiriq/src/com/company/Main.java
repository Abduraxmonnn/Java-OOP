package com.company;

public class Main {

    public static void main(String[] args) {

        Bus Bus = new Bus();
        Bus.setColor("Green");
        Bus.setCompany("Public Transport");
        Bus.setFuelType(80);
        Bus.setModel("Public 1");
        Bus.setConsumption(3.5);
        Bus.setPrice(3500000);
        Bus.Show();
        Bus.start();
        System.out.println("----> The Bus speed: " + Bus.checkSpeed());
        Bus.stop();
    }
}
