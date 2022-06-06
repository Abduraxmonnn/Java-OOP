package com.company;

public class Main {

    public static void main(String[] args) {

        Airplane  airplane = new Airplane();
        airplane.setColor("dsfdsf");
        airplane.setCompany("sdfsd");
        airplane.setFuelType(217);
        airplane.setModel("fsdfsd sdfsd");
        airplane.setPassengers(320);
        airplane.setType("Yo'sdfdsf sdfsd");
        airplane.Show();
        airplane.start();
        airplane.takeoff();
        System.out.println("----> Samalyot tezligi: "+airplane.checkSpeed());
        airplane.stop();
    }
}
