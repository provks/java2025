package Java.Loops;

import java.util.Scanner;

public class PrintNumberFromLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // while (n != 0) {
        //     int lastDigit = n%10;
        //     System.out.println(lastDigit);
        //     n = n/10;
        // }
        for(; n != 0; n = n/10) {
            System.out.println(n%10);
        }
        sc.close();
    }
}
