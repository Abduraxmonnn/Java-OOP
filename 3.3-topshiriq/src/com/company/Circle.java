package com.company;


public class Circle extends Shape implements Drawable{
    private double radius;

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
            return Math.PI *Math.pow(this.getRadius(),2);
    }

    @Override
    public double perimeter() {
        return 2*(Math.PI*this.getRadius());
    }
    @Override
    public void draw() {
        System.out.println("-----> Shakl ma'lumotlari <------");
        System.out.println("----> Shakl rangi: "+this.getColor());
        System.out.println("----> Shakl turi: "+this.getTypeShape());
        System.out.println("----> Aylana ma'lumotlari <-----");
        System.out.println("----> Aylana radiusi: "+this.getRadius());
        System.out.printf("----> Aylana yuzi: %.3f\n",this.area());
        System.out.printf("----> Aylana perimetri: %.3f\n",this.perimeter());
    }
}
