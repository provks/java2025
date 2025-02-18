package Java.Arrays2;

import java.util.Scanner;

public class FindAndUpdate {
    // Linear search
    public static int findAndReplaceElement(int arr[], int x, int y) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                arr[i] = y;
                return i;
            }
        }
        return -1;
    }

    public static int takeInput(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int input =  sc.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int size = takeInput("Enter the size of array: ");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = takeInput("Enter the element for index " + i + ": ");
        }

        // element to find
        int x = takeInput("Enter element to find: ");

        // element to replace with
        int y = takeInput("Element to replace with: ");

        System.out.println("Input array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }


        int updatedIndex = findAndReplaceElement(arr, x, y);
        System.out.println();
        System.out.println(updatedIndex);

        System.out.println("Updated array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
