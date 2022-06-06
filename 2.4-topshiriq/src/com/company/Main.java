package com.company;

public class Main {

    public static void main(String[] args) {
        Student student=new Student();
        student.setStudentId(20028);
        student.setFirstName("sdfdsg");
        student.setLastName("fdgfdgfd");
        student.setAge(19);
        student.setGpa(3.0);

        Student student1 = new Student(20042,"fdgfdgdf","dgdfgdf");
        student1.setAge(21);
        student1.setGpa(1.2);

        String[] departments={"Lift engineering","Muqobil energiya","Mextronika"};

        Faculty faculty=new Faculty();
        faculty.setName("dfgfdgfd gfdgdfd gdfgdff");
        faculty.setShortName("fdgdfg");
        faculty.setDean("dfgdfg");
        faculty.setDepartments(departments);
        faculty.students.add(student);
        faculty.students.add(student1);

        faculty.show();
        faculty.getNumberOfDepartments();
        faculty.showStudents();
        faculty.getNumberOfStudents();

        String[] departments1={"Lift engineering","Muqobil energiya","Mextronika"};
        Faculty faculty1=new Faculty();
        faculty1.setName("fdgdfgd gdfgdf dfgdfg");
        faculty1.setShortName("fdgdfg");
        faculty1.setDean("dgfgdf");
        faculty1.setDepartments(departments1);

        faculty1.show();
        faculty1.getNumberOfDepartments();
        faculty1.showStudents();
        faculty1.getNumberOfStudents();

    }
}
