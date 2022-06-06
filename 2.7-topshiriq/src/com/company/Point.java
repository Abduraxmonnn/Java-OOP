package com.company;

public class Point {
    private double coordinateX;
    private double coordinateY;
    private String color;

    public Point() {

    }

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Show() {
        System.out.println("---> X kordinatasi: "+this.getCoordinateX());
        System.out.println("---> Y kordinatasi: "+this.getCoordinateY());
        System.out.println("---> Rangi: "+this.getColor());
    }
}
