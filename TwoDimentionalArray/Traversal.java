package Java.TwoDimentionalArray;

import java.util.Scanner;

public class Traversal {
    public static void printArray(int []arr[]){
        int rows = arr.length;
        int cols = arr[0].length;
        // printing the array
        for (int i = 0; i < rows; i++) {   // rows
            for (int j = 0; j < cols; j++) {   // cols
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static int[][] takeUserInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
       
        System.out.println("Enter the no. of cols: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {   // rows
            for (int j = 0; j < cols; j++) {   // cols
                System.out.println("Enter the element at position arr["+i+"]["+j+"]");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = takeUserInput();
        printArray(arr);

        // int []arr[] = {{1,2,3}, {4,5,6}, {7,8,9}, {0,8,1}}; // array of arrays

        // System.out.println("Number of rows: "+ arr.length);
        // System.out.println("Number of cols: "+ arr[0].length);
        // System.out.println("Number of cols: "+ arr[1].length);
        // System.out.println("Number of cols: "+ arr[2].length);
        // System.out.println("Number of cols: "+ arr[3].length);  // index out of bound error
    }
}
