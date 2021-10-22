package org.assignemnt_5;

public class String_Comparision {
    public static void main(String[] args) {
        String str3 = new String("Kutty");
        String str4 = new String("Kutty");

        if(str3==str4) {
            System.out.println(" Same text");
        }
        else
            System.out.println("Diff text");

        System.out.println("Output is 'Diff text'. Because both str3 and st4 are pointing to two different String objects");
    }
}
