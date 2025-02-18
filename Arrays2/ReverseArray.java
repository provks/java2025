package Java.Arrays2;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArr(int arr[]) {
        int L = 0;
        int R = arr.length-1;   // last index
        while (L < R) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
    }

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
        System.out.println("input array is: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        reverseArr(arr);
        System.out.println("Reversed array is: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }

    }
}
