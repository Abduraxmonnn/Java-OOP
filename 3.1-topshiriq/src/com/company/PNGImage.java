package com.company;

import java.util.Arrays;

public class PNGImage extends Image implements Imageview{
    private int[][] data;
    private double contrast;

    public PNGImage() {

    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public double getContrast() {
        return contrast;
    }

    public void setContrast(double contrast) {
        this.contrast = contrast;
    }

    @Override
    public void show() {
        System.out.println("-----> PNG image ma'lumotlari <-----");
        System.out.println("----> Name: "+this.getName());
        System.out.println("----> Height: "+this.getHeight());
        System.out.println("----> Width: "+this.getWidth());
        System.out.println("----> Data: "+ Arrays.deepToString(this.getData()));
        System.out.println("----> Contrast: "+this.getContrast());
    }

    @Override
    public void open() {
        System.out.println("----> Rasm ochildi !!!");
    }

    @Override
    public String getSize() {
        return "147 kb";
    }
}
