package com.company;

import java.sql.Time;
import java.util.ArrayList;

public class CarsDealer {
    public String name;
    public String address;
    public Time closedTime;
    public String phone;
    public String[] operators;
    public ArrayList<Car> car = new ArrayList<>();

    public CarsDealer() {

    }

    public CarsDealer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Time getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(Time closedTime) {
        this.closedTime = closedTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] getOperators() {
        return operators;
    }

    public void setOperators(String[] operators) {
        this.operators = operators;
    }

    public ArrayList<Car> getCar() {
        return car;
    }

    public void setCar(ArrayList<Car> car) {
        this.car = car;
    }

    public void Show() {
        System.out.println("\n\t Dealership Information");
        System.out.println("---> Dealership name: " + this.getName());
        System.out.println("---> Dealership address: " + this.getAddress());
        System.out.println("---> Dealership closed time: " + this.getClosedTime());
        System.out.println("---> Dealership phone number: " + this.getPhone());
    }

    public void ShowOperators() {
        if (operators.length != 0) {
            System.out.println("---> Dealership operators: ");
            for (int i = 0; i < operators.length; i++) {
                System.out.println("\t" + (i + 1) + "--> " + operators[i]);
            }
        } else {
            System.out.println("There are not operators in this Dealership ");
        }
    }

    public int getNumberOfOperators() {
        return this.operators.length;
    }

    public int getNumberOfCars() {
        return car.size();
    }
}
