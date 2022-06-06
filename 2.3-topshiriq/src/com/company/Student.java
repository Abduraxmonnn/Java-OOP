package com.company;

import java.util.ArrayList;

public class Student {
    private int  StudentId;
    private String fullname;
    private String faculty;
    private double gpa;
    ArrayList<Subject> subject=new ArrayList<>();

    public Student() {

    }

    public Student(int studentId, String fullname) {
        StudentId = studentId;
        this.fullname = fullname;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<Subject> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }

    public void Show() {
        System.out.println("---> Talaba idsi: "+this.getStudentId());
        System.out.println("---> Talaba to'liq ismi: "+this.getFullname());
        System.out.println("---> Talaba fakulteti: "+this.getFaculty());
        System.out.println("---> Talaba gpasi: "+this.getGpa());
        System.out.println("\t----- Talaba fanlari   -----");
    }

    public void SubjectsShows(){
        if (subject.size()==0) {
            System.out.println("---> Fan  mavjud emas !!!");
        }else {
            for (Subject subjects: subject) {
                subjects.Show();
            }
        }
    }

    public void getNumberOfSubjects() {
        if (subject != null) {
            System.out.println("---> Talabaga biriktirilgan fanlar soni: " + this.subject.size());
        }
    }
}
