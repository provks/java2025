package Java.Patterns2;

import java.util.Scanner;

public class CharacterPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // *********** SQUARE CHARACTER PATTERNS ***********
        // N=3
        // ABC
        // ABC
        // ABC
        // for (int i = 1; i <= n; i++) {
        //     // char p = 'A';
        //     for(int j = 1; j <= n; j++) {
        //         // System.out.print(p);
        //         System.out.print((char)('A'+j-1));
        //         // p = (char)(p+1);
        //     }
        //     System.out.println();
        // }

        // ABC
        // BCD
        // CDE
        // for (int i = 1; i <= n; i++) {
        //     char p = (char)('A'+i-1);
        //     for(int j = 1; j <= n; j++) {
        //         System.out.print(p);
        //         p = (char)(p+1);
        //     }
        //     System.out.println();
        // }

        // AAA
        // BBB
        // CCC
        for (int i = 1; i <= n; i++) {
            char p = (char)('A'+i-1);
            for(int j = 1; j <= n; j++) {
                System.out.print(p);
            }
            System.out.println();
        }
        
        sc.close();
    }
}
