package Java.Methods2;

import java.util.Scanner;

public class PrintAllPrimeNumbers {

    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            // check if a number is prime or not
            if(isPrime(i)) {
                System.out.println(i +" is Prime");
            }
        }
    }

    public static boolean isPrime(int n) {
        System.out.println("calling method isPrime for i="+n);
        for (int j= 2; j < n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printPrime(N);
    }
}
