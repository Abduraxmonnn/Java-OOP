package com.company;

import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        Car car1=new Car();
        car1.setModel("fdgdf");
        car1.setCompany("fdgfdg");
        car1.setPrice(210000.000);
        car1.setColor("gdfgfdg");
        car1.setSpeed(380);
        car1.setAgreementNumber("UMO-12345");

        Car car2=new Car("Jentra","UzautoMotors");
        car2.setPrice(210435435000.000);
        car2.setColor("gdfgdf");
        car2.setSpeed(220);
        car2.setAgreementNumber("UDO-54321");

        String[] opertors={"gdfgdf","fdgdf","fdgfd","fdgfdgfd"};
        CarsDealer daeler=new CarsDealer("fdgdfgfd","fdgdfgfd fgdfgdf");
        Time vaqt=new Time(12,12,12);
        daeler.setClosedTime(vaqt);
        daeler.setPhone("+fdgdfg");
        daeler.setOperators(opertors);
        daeler.car.add(car1);
        daeler.car.add(car2);
        daeler.Show();
        daeler.ShowOperators();
        System.out.println("---> Avtosalon operatorlar soni: "+daeler.getNumberOfOperators());
        System.out.println("---> Avtosalon avtomobillar soni: "+daeler.getNumberOfCars());
    }
}
