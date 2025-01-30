package Java.Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Printing 1-N
        // int i = 1;
        // while (i <= n) {
        //     System.out.println(i);
        //     i++;
        // }

        // Printing N-1;
        int i = n;
        // while (i > 0) {
        //     System.out.println(i);
        //     i--;
        // }

        for (; i > 0; i--) {
            System.out.println(i);
        }




        sc.close();
    }
}
