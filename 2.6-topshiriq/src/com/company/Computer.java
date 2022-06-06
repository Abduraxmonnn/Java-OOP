package com.company;

public class Computer {
    int id;
    String name;
    String company;
    int year;
    double price;
    MotherBoard mb=new MotherBoard();

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
            System.out.println("-------- Kompyuter ma'lumotlari ----------");
            System.out.println("---> Kompyuter idsi: "+this.getId());
            System.out.println("---> Kompyuter nomi: "+this.getName());
            System.out.println("---> Kompyuter kompaniyasi: "+this.getCompany());
            System.out.println("---> Kompyuter yili: "+this.getYear());
            System.out.println("---> Kompyuter narxi: "+this.getPrice());
            this.mb.Show();
        }else{
            System.out.println("-------- Kompyuter ma'lumotlari ----------");
            System.out.println("---> Kompyuter idsi: "+this.getId());
            System.out.println("---> Kompyuter nomi: "+this.getName());
            System.out.println("---> Kompyuter kompaniyasi: "+this.getCompany());
            System.out.println("---> Kompyuter yili: "+this.getYear());
            System.out.println("---> Kompyuter narxi: "+this.getPrice());
            System.out.println("---> Ushbu kompyuterda plat mavjud emas !!!");
        }
    }
}
