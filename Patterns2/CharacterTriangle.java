package Java.Patterns2;

import java.util.Scanner;

public class CharacterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // A
        // BC
        // DEF
        char p = 'A';
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(p);
                p = (char)(p+1);
            }
            System.out.println();
        }
    }
}
