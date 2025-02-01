package Java.Patterns1;

import java.util.Scanner;

public class IntroToPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // SQUARE PATTERN
        // for loop
        for (int i = 1; i <= n; i++) {  // printing rows
            // I am on ith row
            for (int j = 1; j <= n; j++) {  // printing cols
                // I am on ith row and jth col (i,j)
                // System.out.print("* ");
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }

        // while loop
        // int i = 1;
        // while (i <= n) {
        //     int j = 1;
        //     while(j <= n) {
        //         System.out.print(i + "," + j + " ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

    }
}
