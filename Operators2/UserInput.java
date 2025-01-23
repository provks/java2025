package Java.Operators2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float f = sc.nextFloat();
        System.out.println(f);
        int sum = a+b;
        System.out.println(sum);    // 30
    }
}
