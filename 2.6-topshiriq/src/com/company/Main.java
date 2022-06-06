package com.company;

public class Main {

    public static void main(String[] args) {
	MotherBoard mb=new MotherBoard("1234","gdfgfd");
    mb.setCompany("gdfgdf");
    mb.setCpu(5.10);
    mb.setRam(8);
    mb.setHdd(1000);

    Computer computer=new Computer(23,"fdgfdg","fdgfdg");
    computer.setYear(2021);
    computer.setPrice(10100000);
    computer.setMb(mb);
    computer.Show();
    }
}
