package Java.ControlFlow;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // check a number is positive
        // If statement
        // int num = sc.nextInt();
        // if (num > 0) {
        //     System.out.println("positive");
        // } else {
            // System.out.println("negative");
        // }


        // Check if a number is even
        // if (num%2 == 0) {
        //     System.out.println("Even number");
        // } else {
        //     System.out.println("odd");
        // }
        // System.out.println("Coding ninjas!");

        // given a number n, find if its positive, negative, or 0;
        // System.out.print(num);
        // if (num > 0) {
        //     System.out.println(" num is positive");
        // } else if (num < 0) {
        //     System.out.println(" num is negative");
        // } else {
        //     System.out.println(" num is 0");
        // }

        // Given a score of the student, print appropriate grade agains the score.
        // int marks = sc.nextInt();
        // if (marks >= 90) {
        //     System.out.println("A+");
        // } else if (marks >= 80) {
        //     System.out.println("A");
        // } else if (marks >= 70) {
        //     System.out.println("B+");
        // } else if (marks >= 60) {
        //     System.out.println("B");
        // } else if (marks >= 50) {
        //     System.out.println("C");
        // } else if (marks >= 40) {
        //     System.out.println("D");
        // }

        // if (marks >= 40 && marks < 50) {    // 40-49
        //     System.out.println("D");
        // } else if (marks >= 50 && marks < 60) { // 50-59
        //     System.out.println("C");
        // } else if (marks >= 60 && marks < 70) { // 60-69
        //     System.out.println("B");
        // } else {
        //     System.out.println("F");
        // }

        // Scholarship Eligibility
        // int gpa = sc.nextInt();
        // int sports = sc.nextInt();
        // int testMarks = sc.nextInt();
        // // int eligibility = 7;
        // if (testMarks >= 50 && (gpa >= 7 || sports >= 7)) {
        //     System.out.println("Eligible for Scholarship");
        // } else {
        //     System.out.println("not eligible for scholarship.");
        // }

        // Given a number, between 1-7, find day of week
        // int num = sc.nextInt();
        // if (num == 1) {
        //     System.out.println("monday");
        // }
        // if (num == 2) {
        //     System.out.println("tuesday");
        // }
        // if (num == 3) {
        //     System.out.println("wednesday");
        // }
        // if (num == 4) {
        //     System.out.println("thursday");
        // }
        // if (num == 5) {
        //     System.out.println("freday");
        // }
        // if (num == 6) {
        //     System.out.println("saturday");
        // }
        // if (num == 7) {
        //     System.out.println("sunday");
        // } 
        
        // if (num > 7 || num < 1){
        //     System.out.println("invalid no.");
        // }

        // switch (num) {
        //     case 1:
        //         System.out.println("monday");
        //         break;
        //     case 2:
        //         System.out.println("tuesday");
        //         break;
        //     case 3:
        //         System.out.println("wednesday");
        //         break;
        
        //     default:
        //         System.out.println("Invalid no., value should be 1-7");
        //         break;
        // }


        // Given 2 nos. Find greates no.
        int num1 = 10;
        int num2 = 30;
        int greatest;
        if (num1 > num2) {
            greatest = num1;
        } else {
            greatest = num2;
        }
        System.out.println(greatest);

        // Ternary operator
        int greatestNum = (num1 > num2) ? num1 : num2;
        System.out.println(greatestNum);

        int a = 50;
        if (a > 10) {
            System.out.print("Coding");
        } else {
            System.out.print("Ninjas");
        }



        sc.close();
    }
}
