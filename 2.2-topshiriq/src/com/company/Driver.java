package com.company;

public class Driver {
    private String firstName;
    private String secondName;
    private int age;
    private int experience;
    DriverLicense license;

    public Driver() {
        this.license = new DriverLicense();
    }

    public Driver(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
        this.license = new DriverLicense();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public DriverLicense getLicense() {
        return license;
    }

    public void setLicense(DriverLicense license) {
        this.license = license;
    }

    public boolean checkLicense() {
        boolean check = true;
        if (this.getLicense().getSerialCode() == null) {
            check = false;
        }
        return check;
    }

    public void Show() {
        if (checkLicense()) {
            System.out.println("*********** Driver information ***********");
            System.out.println("--> Driver name: " + this.getFirstName());
            System.out.println("--> Driver second name: " + this.getSecondName());
            System.out.println("--> Driver age: " + this.getAge());
            System.out.println("--> Driver salary: " + getExperience());
            System.out.println("************* Driver certification information *************");
            this.license.show();
        } else {
            System.out.println("---> Not found driver information !!!");
        }
    }
}
