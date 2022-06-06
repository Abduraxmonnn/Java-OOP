package com.company;


public class Student {
    private int  StudentId;
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;;

    public Student() {

    }

    public Student(int studentId, String firstName, String lastName) {
        StudentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void Show() {
        System.out.println("---> Talaba idsi: "+this.getStudentId());
        System.out.println("---> Talaba ismi: "+this.getFirstName());
        System.out.println("---> Talaba familyasi: "+this.getLastName());
        System.out.println("---> Talaba yoshi: "+this.getAge());
        System.out.println("---> Talaba gpasi: "+this.getGpa());
        System.out.println("---------------------------------------");
    }

}