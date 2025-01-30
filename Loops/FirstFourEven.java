package Java.Loops;

import java.util.Scanner;

public class FirstFourEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for(int i = 2; i <= n; i++) {
            if (i%2==0) {
                if (count < 4) {
                    System.out.println(i);
                    count++;
                } else {
                    break;
                }
            }
        }
        sc.close();
    }
    
}
