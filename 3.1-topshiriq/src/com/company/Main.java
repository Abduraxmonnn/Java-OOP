package com.company;

public class Main {

    public static void main(String[] args) {

        PNGImage picture = new PNGImage();
        picture.setName("fdsfdsf.png");
        picture.setHeight(1800);
        picture.setWidth(2000);
        int[][] data={{picture.getWidth()},{picture.getHeight()}};
        picture.setData(data);
        picture.setContrast(10.5);
        picture.show();
        picture.open();
        System.out.println("----> Rasm o'lchami: "+picture.getSize());
    }
}
