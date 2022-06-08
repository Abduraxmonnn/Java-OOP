package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Subject OOP = new Subject("qwerty","OOP");
        OOP.setTotalHours(42);
        OOP.setCredit(4);
        OOP.setSemester(2);;

        Subject MATH = new Subject("gdfgdf","Mathematics");
        MATH.setTotalHours(45);
        MATH.setCredit(4);
        MATH.setSemester(2);
        
        Teacher teacher = new Teacher();
        teacher.setFname("Bob");
        teacher.setLname("Richard");
        Date data = new Date(1990, Calendar.JULY,6);
        teacher.setBirthday(data);
        teacher.setDepartment("Teacher Department");
        teacher.subject.add(OOP);
        teacher.subject.add(MATH);
        teacher.Show();
        teacher.ShowSubject();
        System.out.println("----> Teacher's subjects quantity: " + teacher.getNumberOfSubjects());

        Teacher teacher1 = new Teacher();
        teacher1.setFname("Michel");
        teacher1.setLname("Hopkins");
        Date data1 = new Date(1970, Calendar.MARCH,18);
        teacher1.setBirthday(data1);
        teacher1.setDepartment("Teacher 1 Department");
        teacher1.Show();
        teacher1.ShowSubject();
        System.out.println("----> Teacher's subjects quantity: " + teacher.getNumberOfSubjects());

    }
}
