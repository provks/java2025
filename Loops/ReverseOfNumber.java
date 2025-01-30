package Java.Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int reversedNum = 0;
        for (int temp = n; temp > 0; temp = temp / 10) {
            int lastDigit = temp%10;
            reversedNum = reversedNum * 10 + lastDigit;
        }
        System.out.println(reversedNum);
    }
    
}
