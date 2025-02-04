package Java.Patterns1;

import java.util.Scanner;

public class TrianglePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // *
        // * *
        // * * *
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         // cols = row
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 1
        // 1 2
        // 1 2 3
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         // cols = row
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 1
        // 2 3
        // 4 5 6
        // int p = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         // cols = row
        //         System.out.print(p + " ");
        //         p++;
        //     }
        //     System.out.println();
        // }

        
        // 1
        // 2 3
        // 3 4 5
        // for (int i = 1; i <= n; i++) {
        //     // int p = i;
        //     for (int j = 1; j <= i; j++) {
        //         // cols = row
        //         System.out.print(i+j-1);
        //         // System.out.print(p + " ");
        //         // p++;
        //     }
        //     System.out.println();
        // }


        // 1
        // 2 2
        // 3 3 3
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        
        
        sc.close();
    }
}
