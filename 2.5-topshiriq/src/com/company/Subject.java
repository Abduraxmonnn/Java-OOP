package com.company;

public class Subject {
    public String subjectCode;
    public String name;
    public int totalHours;
    public int credit;
    public int semester;

    public Subject() {

    }

    public Subject(String Code, String name) {
        this.subjectCode = Code;
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void Show() {
        System.out.println("--> Subject code: " + this.getSubjectCode());
        System.out.println("--> Subject name: " + this.getName());
        System.out.println("--> Total hours: " + this.getTotalHours());
        System.out.println("--> Subject credit quantity: " + this.getCredit());
        System.out.println("--> Semester: " + this.getSemester());
        System.out.println("-------------------------------------------");
    }
}
