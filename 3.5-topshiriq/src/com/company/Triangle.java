package com.company;

public class Triangle extends Shape implements Drawable {
    private double SideA;
    private double SideB;
    private double SideC;

    public Triangle() {

    }

    public double getSideA() {
        return SideA;
    }

    public void setSideA(double sideA) {
        SideA = sideA;
    }

    public double getSideB() {
        return SideB;
    }

    public void setSideB(double sideB) {
        SideB = sideB;
    }

    public double getSideC() {
        return SideC;
    }

    public void setSideC(double sideC) {
        SideC = sideC;
    }

    @Override
    public double perimeter() {
        return (this.getSideA() + this.getSideB() + this.getSideC());
    }

    @Override
    public double area() {
        double perimeter = (this.getSideA() + this.getSideB() + this.getSideC()) / 2;
        return Math.sqrt(perimeter * (perimeter - this.getSideA()) * (perimeter - this.getSideB()) * (perimeter - this.getSideC()));
    }


    @Override
    public void draw() {
        if (this.SideA > 0 && this.SideC > 0 && this.SideB > 0) {
            System.out.println("-----> Shape Information <-----");
            System.out.println("----> Shape color: " + this.getColor());
            System.out.println("----> Type of Shape: " + this.getTypeShape());
            System.out.println("----> Triangle Information <----");
            System.out.println("----> 1st side of the Triangle: " + this.getSideA());
            System.out.println("----> 2nd side of the Triangle: " + this.getSideB());
            System.out.println("----> 3rd side of the Triangle: " + this.getSideC());
            System.out.println("----> Triangle Perimeter: " + this.perimeter());
            System.out.println("----> Triangle Face: " + this.area());
        } else {
            System.out.println("It was not possible to make a triangle. Enter the sides correctly !!!");
        }
    }
}
