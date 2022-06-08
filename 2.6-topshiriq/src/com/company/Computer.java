package com.company;

public class Computer {
    public int id;
    public String name;
    public String company;
    public int year;
    public double price;
    public MotherBoard mb = new MotherBoard();

    public Computer() {

    }

    public Computer(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MotherBoard getMb() {
        return mb;
    }

    public void setMb(MotherBoard mb) {
        this.mb = mb;
    }

    public boolean checkMotherBoard() {
        return this.getMb() != null;
     }
    public void Show(){
        if (checkMotherBoard()){
            System.out.println("-------- Computer Information ----------");
            System.out.println("---> Computer ID: "+this.getId());
            System.out.println("---> Computer name: "+this.getName());
            System.out.println("---> Computer company: "+this.getCompany());
            System.out.println("---> Computer issue year: "+this.getYear());
            System.out.println("---> Computer price: "+this.getPrice());
            this.mb.Show();
        }else{
            System.out.println("---> Not Found MotherBoard !!!");
        }
    }
}
