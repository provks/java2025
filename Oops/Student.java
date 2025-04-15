package Java.Oops;

import java.util.Scanner;

public class Student {
    // properties/attributes
    public int rollNo;
    public String name;
    private String address;

    //methods
    void print() {
        System.out.println("My name is " + name + " and roll no. is " + rollNo);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println(s1);

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.address);
    }
}
