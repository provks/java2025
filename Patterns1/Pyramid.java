package Java.Patterns1;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // N=4
        // _ _ _ *
        // _ _ * * *
        // _ * * * * *
        // * * * * * * *
        // row
        // for (int i = 1; i <= n; i++) {
        //     // spaces
        //     for (int space = 1; space <= n-i; space++) {
        //         System.out.print(" ");
        //     }

        //     // stars
        //     for(int star = 1; star <= i+i-1; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // _ _ _ 1
        // _ _ 1 2 3
        // _ 1 2 3 4 5
        // 1 2 3 4 5 6 7
        // row
        // for (int i = 1; i <= n; i++) {
        //     // spaces
        //     for (int space = 1; space <= n-i; space++) {
        //         System.out.print("  ");
        //     }

        //     // stars
        //     for(int star = 1; star <= i+i-1; star++) {
        //         System.out.print(star + " ");
        //     }
        //     System.out.println();
        // }


        // _ _ _ 1
        // _ _ 2 2 2
        // _ 3 3 3 3 3
        // 4 4 4 4 4 4 4
        // row
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int space = 1; space <= n-i; space++) {
                System.out.print("  ");
            }

            // stars
            for(int star = 1; star <= i+i-1; star++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
