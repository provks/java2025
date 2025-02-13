package Java.Arrays1;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // declaring array
        int[] arr;
        // int arr1[];
        // int []arr2;

        // initializing
        arr = new int[7];   // storing the refence

        // int fixedArr[] = {1,2,3,4,5};

        // boolean[] arr3 = new boolean[10];
        // System.out.println(arr);
        // System.out.println(arr3);

        // Retreiving values in array using index
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // System.out.println(arr[5]);      // throws index out of bound exception

        // Assign value to array at specific
        // arr[0] = 10;
        // arr[1] = 9;
        // arr[2] = 2;
        // arr[3] = 7;
        // arr[4] = 4;
        // arr[6] = 20;

        System.out.println(arr[1]);

        // TRAVERSING ARRAY
        // For loop
        // for (int index = 0; index < 5; index++) {
        // for (int index = 0; index < arr.length; index++) {
        //     System.out.print(arr[index]+ " ");
        // }
        // System.out.println();

        // int i = 0;
        // while ( i <= 4) {
        //     System.out.println("at index " + i + ": " + arr[i] + " ");
        //     i++;
        // }

        // foreach
        // for (int value:arr) {
        //     System.out.print(value + " ");
        // }


        // Assigning values at runtime
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of array:");
        
        int size = sc.nextInt();
        int[] myArr = new int[size];

        for (int index = 0; index < myArr.length; index++) {
            System.out.println("\n Enter the value for index " + index + ": ");
            // int value = sc.nextInt();
            // myArr[index] = value;
            myArr[index] = sc.nextInt();
        }
        sc.close();

        for (int value:myArr) {
            System.out.print(value + " ");
        }
        



    }
}
