package Java.Patterns2;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //   1
        //  121
        // 12321
        //1234321
        for (int i = 1; i <= n; i++) {
            // spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // incNum
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // decNum
            for(int j = i-1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
