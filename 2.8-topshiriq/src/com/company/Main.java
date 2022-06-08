package com.company;

import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("BMW");
        car1.setCompany("BMW Company");
        car1.setPrice(210000.000);
        car1.setColor("Black");
        car1.setSpeed(380);
        car1.setAgreementNumber("UMO-12345");

        Car car2 = new Car("Ford", "Ford Auto Motors");
        car2.setPrice(215000.000);
        car2.setColor("white");
        car2.setSpeed(220);
        car2.setAgreementNumber("UDO-54321");

        String[] opertors = {"Alex", "Sara", "Safia", "Jorg"};
        CarsDealer daeler = new CarsDealer("Car Dealer", "some Location");
        Time time = new Time(12, 12, 12);
        daeler.setClosedTime(time);
        daeler.setPhone("+fdgdfg");
        daeler.setOperators(opertors);
        daeler.car.add(car1);
        daeler.car.add(car2);
        daeler.Show();
        daeler.ShowOperators();
        System.out.println("---> Number of dealership operator: " + daeler.getNumberOfOperators());
        System.out.println("---> Dealerships number: " + daeler.getNumberOfCars());
    }
}
