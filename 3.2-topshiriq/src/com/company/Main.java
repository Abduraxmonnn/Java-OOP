package com.company;

public class Main {

    public static void main(String[] args) {

        JPEGImage picture = new JPEGImage();
        picture.setName("gdfgdfg.jpg");
        picture.setHeight(1800);
        picture.setWidth(2000);
        picture.setVerticalResolution(1200);
        picture.setHorizontalResolution(3000);
        int[][] data={{picture.getWidth()},{picture.getHeight()}};
        picture.setData(data);
        picture.show();
        picture.open();
        System.out.println("----> Rasm o'lchami: "+picture.getSize());

    }
}
