package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Teacher {
    public String fname;
    public String lname;
    public Date birthday;
    public String department;
    ArrayList<Subject> subject = new ArrayList<>();

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

    public void Show() {
        System.out.println("\n\t------> Teacher information <------");
        System.out.println("---> Teacher firstname: " + this.getFname());
        System.out.println("---> Teacher lastname: " + this.getLname());
        System.out.println("---> Teacher birthday: " + this.getBirthday());
        System.out.println("---> Teacher's department: " + this.getDepartment());
        System.out.println("---> Teacher's subjects: ");
    }

    public boolean checkSubject() {
        return subject.size() != 0;
    }

    public void ShowSubject() {
        if (checkSubject()) {
            for (Subject subjects : subject) {
                subjects.Show();
            }
        } else {
            System.out.println("\tThere are not subjects for this teacher");
        }
    }

    public int getNumberOfSubjects() {
        if (checkSubject()) {
            return subject.size();
        }
        return 0;
    }
}
