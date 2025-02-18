package Java.Arrays2;

import java.util.Scanner;

public class InsertElementAtGivenIndex {

    public static int insertElementAtPosition(int arr[], int elem, int pos, int size) {
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = elem;
        return size+1;
    }

    public static int takeInput(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int input =  sc.nextInt();
        return input;
    }
    public static void main(String[] args) {
        
        // get capacity
        int cap = takeInput("Enter capacity: ");
        // creating array of capacity
        int arr[] = new int[cap];
        // get size
        int size = takeInput("Enter size: ");
        // take array elements input
        for (int i = 0; i < size; i++) {
            arr[i] = takeInput("Enter the element for index " + i + ": ");
        }
        // get element to insert
        int element = takeInput("Enter element to insert: ");
        // get position to insert element at
        int pos = takeInput("Enter the position to insert element: ");
        // input array
        System.out.println("Input array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // insert the given element at given position
        int updatedArraySize = insertElementAtPosition(arr, element, pos, size);
        System.out.println(updatedArraySize);
        System.out.println("Updated array");
        for (int i = 0; i < updatedArraySize; i++) {
            System.out.print(arr[i] + " ");
        }
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }

    }
}
