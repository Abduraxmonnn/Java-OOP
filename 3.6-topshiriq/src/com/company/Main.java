package com.company;

public class Main {

    public static void main(String[] args) {

        Car car=new Car();
        car.setColor("dsfdsf");
        car.setCompany("dsffdsfsd");
        car.setFuelType(57);
        car.setModel("sdfds");
        car.setConsumption(1.5);
        car.setPrice(135000000);
        car.Show();
        car.start();
        System.out.println("----> Avtomobil tezligi: "+car.checkSpeed());
        car.stop();
    }
}
