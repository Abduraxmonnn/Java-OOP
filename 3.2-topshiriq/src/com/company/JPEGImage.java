package com.company;

import java.util.Arrays;

public class JPEGImage extends Image implements Imageview{
    private int[][] data;
    private double verticalResolution;
    private double horizontalResolution;

    public JPEGImage() {

    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public double getVerticalResolution() {
        return verticalResolution;
    }

    public void setVerticalResolution(double verticalResolution) {
        this.verticalResolution = verticalResolution;
    }

    public double getHorizontalResolution() {
        return horizontalResolution;
    }

    public void setHorizontalResolution(double horizontalResolution) {
        this.horizontalResolution = horizontalResolution;
    }

    @Override
    public void show() {
        System.out.println(" Jpg rasm ma'lumotlari");
        System.out.println("----> Name: "+this.getName());
        System.out.println("----> Height: "+this.getHeight());
        System.out.println("----> Width: "+this.getWidth());
        System.out.println("----> Vertical resolution: "+this.getVerticalResolution());
        System.out.println("----> Horizontal resolution: "+this.getHorizontalResolution());
        System.out.println("----> Data: "+ Arrays.deepToString(this.getData()));
    }

    @Override
    public void open() {
        System.out.println("----> Rasm ochildi !!!");
    }

    @Override
    public String getSize() {
        return "245 kb";
    }
}
