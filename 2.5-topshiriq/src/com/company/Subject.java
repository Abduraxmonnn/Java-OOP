package com.company;

public class Subject {
    private String subjectCode;
    private String name;
    private int totalHours;
    private int credit;
    private int semester;

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

    public void  Show(){
        System.out.println("---> Fan kodi: "+this.getSubjectCode());
        System.out.println("---> Fan nomi: "+this.getName());
        System.out.println("---> Umumiy soatlar soni: "+this.getTotalHours());
        System.out.println("---> Fan kreditlar soni: "+this.getCredit());
        System.out.println("---> Smester: "+this.getSemester());
        System.out.println("-------------------------------------------");
    }
}
