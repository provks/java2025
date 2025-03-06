package Java.Strings;

import java.util.Scanner;

public class IntroToStrings {
    public static void main(String[] args) {
        // ************** Character array **************
        int[] arr = new int[5];
        // System.out.println(arr);
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        char[] ch2 = new char[5];
        System.out.println(ch); // values
        System.out.println(ch.toString()); // reference
        // take input character from user (No method available to take character as input from user)
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();


        // ************** Declaring and Initializing String **************
        // String Literals
        String name = "Varun";
        System.out.println(name);

        // new keyword
        String str1 = new String("      Coding ninjas.   ");  // passing string literals
        String str2 = new String(ch);  // passing character array
        byte[] b = {97, 98, 99, 100};
        String str3 = new String(b);  // passing byte array
        // System.out.println("str1: " + str1);
        // System.out.println("str2: " + str2);
        // System.out.println("str3: " + str3);

        // ************** METHODS IN STRINGS **************
        // equals: returns boolean used to compare two strings
        // System.out.println(str1.equals(str2));
        // System.out.println(str1.equals("Coding ninjas"));
        // System.out.println(str1.equals("Coding ninja"));

        // length: returns the size/length of the string
        System.out.println("length of str1 is: " + str1.length());
        // System.out.println("length of str1 is: " + "varun".length());

        // charAt: returns the charater at index provided
        // System.out.println("varun".charAt(2));
        // System.out.println(str1.charAt(5));

        // trim: returns the trimmed -> removes the spaces from leading spaces and trailing spaces
        System.out.println(str1);
        String trimmedString = str1.trim();
        System.out.println("trimmed value: " + trimmedString);
        System.out.println("trimmed length: " + trimmedString.length());

        // replace: search for the given value and replace with provided value, returns the replaced string
        System.out.println(str1.replace(' ', '#' ));

        // upper/lowercase
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        // substring: which returns the partial string from startIndex to endIndex(excluded)
        System.out.println(name.substring(1));
        System.out.println(name.substring(2, 5));

        //  contains: to check if a substring is present in the string
        System.out.println(name.contains("run"));
    }
}
