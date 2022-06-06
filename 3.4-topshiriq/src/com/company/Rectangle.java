package com.company;

public class Rectangle extends Shape implements Drawable {
    private double sideA;
    private double sideB;

    public Rectangle() {

    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return this.getSideA()*this.getSideB();
    }

    @Override
    public double perimeter() {
        return 2*(this.getSideA()+this.getSideB());
    }
    @Override
    public void draw() {
        System.out.println("-----> Shakl ma'lumotlari <------");
        System.out.println("----> Shakl rangi: "+this.getColor());
        System.out.println("----> Shakl turi: "+this.getTypeShape());
        System.out.println("----> To'rtburchak ma'lumotlari <-----");
        System.out.println("----> To'rtburchak 1-tomoni: "+this.getSideA());
        System.out.println("----> To'rtburchak 2-tomoni: "+this.getSideB());
        System.out.println("----> To'rtburchak yuzi: "+this.area());
        System.out.println("----> To'rtburchak perimetri: "+this.perimeter());
    }
}
