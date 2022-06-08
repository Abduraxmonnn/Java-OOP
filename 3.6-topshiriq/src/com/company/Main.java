package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("Yellow");
        car.setCompany("Volkswagen");
        car.setFuelType(100);
        car.setModel("Modern");
        car.setConsumption(1.5);
        car.setPrice(1350000);
        car.Show();
        car.start();
        System.out.println("----> The car speed: " + car.checkSpeed());
        car.stop();
    }
}
