package Java.Arrays2;

import java.util.Scanner;

public class MoveZeroesToEnd {

    public static void moveZeros(int n, int []a) {
        // Write your code here.
        // index to insert non zero values
        int j = 0;
        // loop finding non-zero values
        for (int i = 0; i < n; i++) {
            // replace jth index with non zero value found
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }
        // set the ramining indices 0
        for (; j < n; j++) {
            a[j] = 0;
        }
    }
     public static int takeInput(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int input =  sc.nextInt();
        return input;
    }

    public static void main(String[] args) {
        // get size
        int size = takeInput("Enter size: ");
        int arr[] = new int[size];
        // take array elements input
        for (int i = 0; i < size; i++) {
            arr[i] = takeInput("Enter the element for index " + i + ": ");
        }

        moveZeros(size, arr);
        System.out.println("output array is: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }

    }
}
