package com.company;

public class Circle {
    private double radius;
    private String color;
    Point point;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public boolean CheckPoint(){
        boolean check=false;
        if (point.getColor()!=null && this.point.getCoordinateY()!=0 &&this.point.getCoordinateX()!=0){
            check=true;
        }
        return check;
    }
    public boolean draw(){
        boolean check = false;
        if (CheckPoint()) {
            if (this.getRadius() > 0) {
                check = true;
            }
        }
            return check;
    }
    public void Show(){
        if (CheckPoint()) {
            System.out.println("\n\t------ Aylana ma'lumotlari -------");
            System.out.println("---> Aylana radiusi: " + this.getRadius());
            System.out.println("---> Aylana rangi: " + this.getColor());
            System.out.println("\n\t Aylana markazi ma'lumotlari: ");
            this.point.Show();
            if (draw()){
                System.out.println("\n\t ---- Aylana chizildi !!! ----");
            }else{
                System.out.println("\n\t ---- Aylana chizilmadi !!! ----");
            }
        }else{
            System.out.println("---- Aylana chizish uchun tekislikdagi nuqtani belgilang!!! ----");
        }
    }
}
