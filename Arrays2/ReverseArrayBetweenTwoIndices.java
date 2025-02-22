package Java.Arrays2;

import java.util.Scanner;

public class ReverseArrayBetweenTwoIndices {
    
    public static void reverseArr(int arr[], int startIndex, int endIndex) {
        int L = startIndex;
        int R = endIndex;
        while (L < R) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
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
        // get start index
        int startIndex = takeInput("Enter start index: ");
        // get end index
        int endIndex = takeInput("Enter end index: ");
        System.out.println("Input Array is: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }

        reverseArr(arr, startIndex, endIndex);
        System.out.println("Reversed array is: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }

    }
}
