package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Teacher {
    private String fname;
    private String lname;
    private Date birthday;
    private String department;
    ArrayList<Subject> subject=new ArrayList<>();

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<Subject> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }

    public void Show(){
        System.out.println("\n\t------> O'qituvchi ma'lumotlari <------");
        System.out.println("---> O'qituvchi ismi: "+this.getFname());
        System.out.println("---> O'qituvchi familyasi: "+this.getLname());
        System.out.println("---> O'qituvchi tug'ulgan sanasi: "+this.getBirthday());
        System.out.println("---> O'qituvchi departamenti: "+this.getDepartment());
        System.out.println("---> O'qituvchiga biriktirilgan fanlar: ");
    }

    public boolean checkSubject(){
        return subject.size() != 0;
    }

    public void ShowSubject() {
        if (checkSubject()){
            for (Subject subjects : subject) {
                subjects.Show();
            }
        }else{
            System.out.println("\tUshbu o'qituvchida fan mavjud emas");
        }
    }
    public int  getNumberOfSubjects() {
        if (checkSubject()) {
            return subject.size();
        }
        return 0;
    }
}
