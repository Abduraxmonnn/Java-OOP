package com.company;

public class MotherBoard {
    public String serialCode;
    public String name;
    public String company;
    public int year;
    public double cpu;
    public int ram;
    public int hdd;

    public MotherBoard() {

    }

    public MotherBoard(String serialCode, String name) {
        this.serialCode = serialCode;
        this.name = name;
    }

    public String getSerialCode() {
        return serialCode;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void Show() {
        System.out.println("\n\t MotherBoard information ");
        System.out.println("--> Serial code: " + this.getSerialCode());
        System.out.println("--> Name: " + this.getName());
        System.out.println("--> Company: " + this.getCompany());
        System.out.println("--> Year of issue: " + this.getYear());
        System.out.println("--> CPU: " + this.getCpu());
        System.out.println("--> RAM: " + this.getRam());
        System.out.println("--> HDD: " + this.getHdd());
    }
}
