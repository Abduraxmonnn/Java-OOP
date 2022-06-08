package com.company;

public class Circle {
    public double radius;
    public String color;
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

    public boolean CheckPoint() {
        return point.getColor() != null && this.point.getCoordinateY() != 0 && this.point.getCoordinateX() != 0;
    }

    public boolean draw() {
        boolean check = false;
        if (CheckPoint()) {
            if (this.getRadius() > 0) {
                check = true;
            }
        }
        return check;
    }

    public void Show() {
        if (CheckPoint()) {
            System.out.println("\n\t------ Circle Information -------");
            System.out.println("---> Circle radius: " + this.getRadius());
            System.out.println("---> Circle color: " + this.getColor());
            System.out.println("\n\t Circle center information: ");
            this.point.Show();
            if (draw()) {
                System.out.println("\n\t ---- The Circle drawn !!! ----");
            } else {
                System.out.println("\n\t ---- The Circle was not drawn !!! ----");
            }
        } else {
            System.out.println("---- Mark a point on the plane to draw a circle !!! ----");
        }
    }
}
