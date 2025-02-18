package Java.Arrays2;

import java.util.Scanner;

public class TakingInput {

    public static int[] takeInput() {
        System.out.println("Enter the size of arr:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++ ) {
            System.out.println("Enter element for index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
