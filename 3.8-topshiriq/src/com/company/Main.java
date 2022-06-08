package com.company;

public class Main {

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.setColor("White");
        airplane.setCompany("American Air-lance");
        airplane.setFuelType(200);
        airplane.setModel("Boeing 787-800");
        airplane.setPassengers(320);
        airplane.setType("Public");
        airplane.Show();
        airplane.start();
        airplane.takeoff();
        System.out.println("----> Airplane speed: " + airplane.checkSpeed());
        airplane.stop();
    }
}
