package Java.Patterns1;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 111
        // 222
        // 333
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         // ith row and jth col
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // 123
        // 123
        // 123
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         // ith row and jth col
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


        // 321
        // 321
        // 321
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
            // for (int j = n; j > 0; j--) {
                // ith row and jth col
                // System.out.print(j);
                System.out.print(n+1-j);
            }
            System.out.println();
        }



        sc.close();
    }
}
