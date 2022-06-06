package com.company;

public class Main {

    public static void main(String[] args) {
	Point point = new Point(2.5,3.4);
    point.setColor("Black");

    Circle circle = new Circle(1.2);
    circle.setColor("Red");
    circle.setPoint(point);
    circle.Show();
    }
}
