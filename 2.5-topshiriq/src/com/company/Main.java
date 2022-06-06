package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Subject OOP = new Subject("fdgdf","fdgfd");
        OOP.setTotalHours(12);
        OOP.setCredit(3);
        OOP.setSemester(2);;

        Subject WEB = new Subject("gdfgdf","fdgdfg dfgfd");
        WEB.setTotalHours(15);
        WEB.setCredit(3);
        WEB.setSemester(4);
        
        Teacher teacher = new Teacher();
        teacher.setFname("fdgdf");
        teacher.setLname("dfgfd'dfgdf");
        Date sana=new Date(1980,12,12);
        teacher.setBirthday(sana);
        teacher.setDepartment("fdgfdg fdgdfg fdgdfg");
        teacher.subject.add(OOP);
        teacher.subject.add(WEB);
        teacher.Show();
        teacher.ShowSubject();
        System.out.println("----> O'qituvchiga biriktirilgan fanlar soni: " + teacher.getNumberOfSubjects());

        Teacher teacher1 = new Teacher();
        teacher1.setFname("Temurbek");
        teacher1.setLname("Qo'chqorov");
        Date sana1=new Date(1980,12,12);
        teacher1.setBirthday(sana1);
        teacher1.setDepartment("Informationn system engineering");
        teacher1.Show();
        teacher1.ShowSubject();
        System.out.println("----> O'qituvchiga biriktirilgan fanlar soni: " + teacher.getNumberOfSubjects());

    }
}
