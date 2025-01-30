package Java.Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        
        int count = n-2;

        while (count > 0) {
            int nextNum = a+b;
            System.out.println(nextNum);
            a = b;
            b = nextNum;
            count--;
        }

        sc.close();
    }
}
