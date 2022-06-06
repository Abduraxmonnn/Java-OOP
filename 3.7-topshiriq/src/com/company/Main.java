package com.company;

public class Main {

    public static void main(String[] args) {

        Bus Bus=new Bus();
        Bus.setColor("dsfsd");
        Bus.setCompany("sdfds");
        Bus.setFuelType(85);
        Bus.setModel("dsfdsf");
        Bus.setConsumption(3.5);
        Bus.setPrice(350000000);
        Bus.Show();
        Bus.start();
        System.out.println("----> Avtobus tezligi: "+Bus.checkSpeed());
        Bus.stop();
    }
}
