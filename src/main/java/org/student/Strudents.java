package org.student;

/**
 * Implemented Assignment four where Method Overriding is achieved
 */
public class Strudents {
    public void getStudentInfo(int id){
        System.out.println("Student Id : " + id);
    }

    public void getStudentInfo(int id, String name){
        System.out.println("Student Id : " + id);
        System.out.println("Student Name : " + name);
    }
    public void getStudentInfo(String email, int PhoneNumber){
        System.out.println("Student email : " + email);
        System.out.println("Student PhoneNumber : " + PhoneNumber);
    }
}
