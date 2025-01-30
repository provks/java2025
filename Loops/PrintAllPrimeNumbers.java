package Java.Loops;

import java.util.Scanner;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int n = 2; n <= N; n++) {
            // check if a number is prime or not
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
            } 
        }

    }
}
