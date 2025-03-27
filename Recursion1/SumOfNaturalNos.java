package Java.Recursion1;

import java.util.Scanner;


public class SumOfNaturalNos {

    public static int sumN(int n) {
        // base case
        if ( n == 1 ) {
            return 1;
        }

        // recursive call
        int smallOutput = sumN(n-1);
        // small calculation
        int output = n + smallOutput;
        return output;
    }

    public static void main(String[] args) {
        // finding facotrial of a given number;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumN(n);
        System.out.println(ans);
    }
}
