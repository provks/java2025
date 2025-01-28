package Java.Loops;

import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n;) {
            if (i%2 == 0) {
                sum = sum + i;
                i = i+2;
                // System.out.println(i);
            } else {
                i++;
                count++;
            }
        }
        // for (int i = 2; i <= n; i = i+2) {
        //     sum = sum + i;
        // }
        System.out.println(sum);
        System.out.println(count);
    }
}
