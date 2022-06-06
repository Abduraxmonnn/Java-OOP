package com.company;

public class Main {

    public static void main(String[] args) {

        Subject OOP = new Subject("sdfsd","sdffds",3);
        OOP.setTotalHours(12);
        OOP.setSemester(2);
        OOP.setTeacher("sfdsdff Qo'sdfs");

        Subject WEB = new Subject("1997","dsf sfdsdgs",3);
        WEB.setTotalHours(15);
        WEB.setSemester(4);
        WEB.setTeacher("dsfds dsfds");

        Student student = new Student(20028,"sfdsfs sdfsd");
        student.setFaculty("sdfsdfsd");
        student.setGpa(3.0);

        student.subject.add(OOP);
        student.subject.add(WEB);

        student.Show();
        student.SubjectsShows();
        student.getNumberOfSubjects();

        Student student_two = new Student(20028,"Humoyun Saydullayev");
        student_two.setFaculty("sdfds");
        student_two.setGpa(3.0);
        System.out.println();
        System.out.println();
        System.out.println();
        student_two.Show();
        student_two.SubjectsShows();
        student_two.getNumberOfSubjects();
    }
}
