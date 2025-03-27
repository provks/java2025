package Java.Recursion1;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        // break out problem into sub-problem
        int smallOutput = fact(n-1);
        int output = n * smallOutput;
        return output;
    }
    public static void main(String[] args) {
        // finding facotrial of a given number;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factAns = fact(n);
        System.out.println(factAns);
    }
}
