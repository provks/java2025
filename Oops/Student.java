package Java.Oops;

import java.util.Scanner;

public class Student {
    // properties/attributes
    public int rollNo;
    public String name;
    private String address;
    double cgpa;
    // final double conversionFactor = 0.95;
    final static double conversionFactor = 0.95;
    private static int TOTAL_STUDENTS;

    // constructor
    Student() {
        // this("student");
        // conversionFactor = 0.95;
        TOTAL_STUDENTS++;
    }

    // public Student(String name) {
    //     this.name = name;
    // }
    
    // public Student(String studentName, int rollNum, String studentAddress) {
    //     name = studentName;
    //     rollNo = rollNum;
    //     address = studentAddress;
    // }

    //methods
    void print() {
        System.out.println("My name is " + name + " and roll no. is " + rollNo + ". I live in " + address + " factor " + conversionFactor);
    }

    // Getter (to give read access)
    public String getAddress() {
        return address;
    }

    // Setter (to write access)
    public void setAddress(String address) {
        if (address.length() < 5) {
            System.out.println("Invalid address, it should be of atleast 5 characters");
            return;
        }
        // System.out.println(address);
        System.out.println("this" +  this);
        this.address = address;
    }

    // Getter (to give read access)
    public static int getTotalStudents() {
        return TOTAL_STUDENTS;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Student s1 = new Student("varun");
        // Student s2 = new Student("varun", 51, "New Delhi");
        // Student s3 = new Student("varun", 51);
        Student s4 = new Student();
        System.out.println(s4.conversionFactor);
        // System.out.println(s1);
        // s4.conversionFactor = 0.9;

        // System.out.println(s4.name);
        // s1.print();
        // s2.print();
        s4.print();
        // System.out.println(s4.totalStudents);
        System.out.println(Student.TOTAL_STUDENTS);
        System.out.println(s4.TOTAL_STUDENTS);
        Student.TOTAL_STUDENTS = 100;
        System.out.println(Student.TOTAL_STUDENTS);
        // System.out.println(s1.rollNo);
        // System.out.println(s1.address);
    }
}
