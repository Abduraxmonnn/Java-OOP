package com.company;

public class Driver {
    private String name;
    private int age;
    private int experience;

    public Driver() {

    }

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void Show() {
        System.out.println("**************** Driver information ****************");
        System.out.println("--> Driver name: " + this.getName());
        System.out.println("--> Driver age: " + this.getAge());
        System.out.println("--> Driver salary: " + getExperience());
    }
}
