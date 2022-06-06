package com.company;

public class Car {
    String model;
    String company;
    double price;
    String color;
    int speed;
    String agreementNumber;

    public Car() {

    }

    public Car(String model, String company) {
        this.model = model;
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getAgreementNumber() {
        return agreementNumber;
    }

    public void setAgreementNumber(String agreementNumber) {
        this.agreementNumber = agreementNumber;
    }

    public void Show(){
        System.out.println("----- Avtomobil ma'lumotlari -----");
        System.out.println("---> Avtomobil modeli: "+this.getModel());
        System.out.println("---> Avtomobil kompaniyasi: "+this.getCompany());
        System.out.println("---> Avtomobil narxi: "+this.getPrice()+"$");
        System.out.println("---> Avtomobil  rangi: "+this.getColor());
        System.out.println("---> Avtomobil tezligi: "+this.getSpeed());
        System.out.println("---> Avtomobil shartnoma raqami: "+this.getAgreementNumber());
    }
}
