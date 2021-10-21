package org.student;

import org.college.College;

public class Student extends College {
    void studentName(){
        System.out.println("Display student name");
    }

    void studentId(){
        System.out.println("Display student ID");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.collegeCode();
        s1.collegeName();
        s1.collegeRank();
        s1.deptName();
    }

}


