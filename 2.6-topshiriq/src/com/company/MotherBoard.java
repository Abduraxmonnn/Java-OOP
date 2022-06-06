package com.company;

public class MotherBoard {
    String serialCode;
    String name;
    String company;
    int year;
    double cpu;
    int ram;
    int hdd;

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
    public void Show(){
        System.out.println("\n\t Onaplata ma'lumotlari ");
        System.out.println("---> Seriya kodi: "+this.getSerialCode());
        System.out.println("---> Nomi: "+this.getName());
        System.out.println("---> Kompaniyasi: "+this.getCompany());
        System.out.println("---> Ishlab chiqarilgan yili: "+this.getYear());
        System.out.println("---> Cpu: "+this.getCpu());
        System.out.println("---> Ram: "+this.getRam());
        System.out.println("---> Hdd: "+this.getHdd());
    }
}
