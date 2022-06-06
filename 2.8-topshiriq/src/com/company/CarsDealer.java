package com.company;

import java.sql.Time;
import java.util.ArrayList;

public class CarsDealer {
    String name;
    String address;
    Time closedTime;
    String phone;
    String[] operators;
    ArrayList<Car> car=new ArrayList<>();

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

    public void Show(){
        System.out.println("\n\t Avtosalon ma'lumotlari ");
        System.out.println("---> Avtosalon nomi: "+this.getName());
        System.out.println("---> Avtosalon addresi: "+this.getAddress());
        System.out.println("---> Avtosalon yopilish vaqti: "+this.getClosedTime());
        System.out.println("---> Avtosalon telefon raqami: "+this.getPhone());
    }

    public void ShowOperators() {
        if (operators.length!=0) {
            System.out.println("---> Avtosalon operatorlari: ");
            for (int i = 0; i < operators.length; i++) {
                System.out.println("\t"+(i + 1) + "--> " + operators[i]);
            }
        }else{
            System.out.println("Ushbu avtosalonda operatorlar mavjud emas");
        }
    }
    public int getNumberOfOperators() {
        return this.operators.length;
    }

    public int getNumberOfCars() {
        return car.size();
    }
}
