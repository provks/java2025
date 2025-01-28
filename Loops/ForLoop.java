package Java.Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        int i = 1;
        for(; i <= N; i++) {
            System.out.println(i);
            // sum = sum + i;
            // System.out.println(".Varun");
        }
        System.out.println(i);
        System.out.println(sum);
    }
}
