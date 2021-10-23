package org.assignment_7;

public class String_Index {
    public static char getCharecter(int i, String input){
        return input.charAt(i);
    }

    public static void StringCompareUsingEqualsOperator(String s1, String s2){
        if(s1==s2){
            System.out.println("Both Strings are equal");
        }else{
            System.out.println("Both Strings are not equal");
        }
    }

    public static void StringCompareUsingEquals(String s1, String s2){
        if(s1.equals(s2)){
            System.out.println("Both Strings are equal");
        }else{
            System.out.println("Both Strings are not equal");
        }
    }

    public static void StringCompareUsingIgnoreCase(String s1, String s2){
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Both Strings are equal");
        }else{
            System.out.println("Both Strings are not equal");
        }
    }

    public static void replaceString(String str, int startIndex, int endIndex){
        char substitute = '#';
        if((startIndex < 0 || startIndex > str.length()) || (endIndex < 0 || endIndex > str.length())){
            System.out.println("Start or End index is out of bounds");
        }
        else
        {
            String output = "";

            for (int i = startIndex; i <= endIndex; i++) {
                output = str.substring(0, i) + substitute + str.substring(i+1);
                //str.replace(str.charAt(i), substitute);
                str = output;
            }
            System.out.println(output);
            for(int i = 5; i <=14; i++){
                System.out.println(output.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        /*String input = "Java Exercise";
        System.out.println(String_Index.getCharecter(5, input));
        System.out.println(String_Index.getCharecter(11, input));
        String s1="I am Learning Java";
        String s2="I am learning java";
        String_Index.StringCompareUsingEqualsOperator(s1,s2);
        String_Index.StringCompareUsingEquals(s1,s2);
        String_Index.StringCompareUsingIgnoreCase(s1,s2);*/
        String_Index.replaceString("I am working with Java8", 8, 11);

    }
}
