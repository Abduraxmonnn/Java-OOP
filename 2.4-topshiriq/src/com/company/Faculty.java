package com.company;

import java.util.ArrayList;

public class Faculty {
    private String name;
    private String shortName;
    public String[] departments;
    private String dean;
    ArrayList<Student> students = new ArrayList<>();

    public Faculty(){

    }

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String[] getDepartments() {
        return departments;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    public String getDean() {
        return dean;
    }

    public void setDean(String dean) {
        this.dean = dean;
    }

    public void show(){
        System.out.println("-----> Fakultet ma'lumotlari <----");
        System.out.println("---> Fakultet nomi: " + this.getName());
        System.out.println("---> Fakultet qisqa nomi: " + this.getShortName());
        System.out.println("---> Fakultet dekani: " + this.getDean());
        System.out.println("--->Fakultet yo'nalishlari: ");
        for (int i = 0; i < departments.length; i++) {
            System.out.println("\t"+(i+1)+ "---> " + departments[i]);
        }
        System.out.println("--------------------------------");
    }

    public void getNumberOfDepartments(){
        if (departments!=null){
            System.out.println("-->>> Yo'nalishlar soni: " + departments.length);
        }else{
            System.out.println("--> Fakultet yo'nalishlari mavjud emas !!!");
        }
    }

    public void showStudents() {
        if (students.size() == 0) {
            System.out.println("------> Talaba mavjud emas !!! <-----");
        } else {
            System.out.println("Fakultet talabalari");
            for (Student student : students) {
                student.Show();
            }

        }
    }

    public void getNumberOfStudents(){
        if (students!=null){
            System.out.println("-->>> Fakultet talabalar soni: " + students.size());
        }
    }


}
