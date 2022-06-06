package com.company;

public class Triangle extends Shape implements Drawable{
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
        return (this.getSideA()+this.getSideB()+this.getSideC());
    }
    @Override
    public double area() {
        double perimeter=(this.getSideA()+this.getSideB()+this.getSideC())/2;
        return Math.sqrt(perimeter*(perimeter-this.getSideA())*(perimeter-this.getSideB())*(perimeter-this.getSideC()));
    }


    @Override
    public void draw() {
        if ((this.getSideA()+this.getSideB())>this.getSideC() && (this.getSideB()+this.getSideC())>this.getSideA() && (this.getSideA()+this.getSideC())>this.getSideB()){
            System.out.println("-----> Shakl ma'lumotlari <-----");
            System.out.println("----> Shakl rangi: "+this.getColor());
            System.out.println("----> Shakl turi: "+this.getTypeShape());
            System.out.println("----> Uchburchak ma'lumotlari <----");
            System.out.println("----> Uchburchak 1-tomoni: "+this.getSideA());
            System.out.println("----> Uchburchak 2-tomoni: "+this.getSideB());
            System.out.println("----> Uchburchak 3-tomoni: "+this.getSideC());
            System.out.println("----> Uchburchak perimetri: "+this.perimeter());
            System.out.println("----> Uchburchak yuzi: "+this.area());
        }else{
            System.out.println("Uchburchak yasashning iloji bo'lmadi.Tomonlarni to'g'ri kiriting !!!");
        }
    }
}
