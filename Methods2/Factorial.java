package Java.Methods2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        if (n < 0) {
            return;
        }
        int result = factorial(n);
        System.out.println(result);
        // System.out.println(result+2);
    }

    public static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        // System.out.println(ans);
        return ans;
    }
}
