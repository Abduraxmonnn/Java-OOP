package com.company;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver();
        Car car = new Car();
        car.setDriver(driver);
        car.setModel("Bugatti Chiron");
        car.setColor("White");
        car.setCompany("official factory of Bugatti");
        car.setSpeed(475);
        car.setConsumption(5.5);
        car.Show();

        System.out.println("\n-------------------------------------\n");

        Driver driver1 = new Driver("Alex", 22, 5);
        Car car1 = new Car("Maserati", "Yellow");
        car1.setDriver(driver1);
        car1.setCompany("official factory of Maserati");
        car1.setSpeed(350);
        car1.setConsumption(3.5);
        car1.Show();
    }
}
