package Java.TwoDimentionalArray;

public class Intro {
    public static void main(String[] args) {
        // 1D array
        int[] arr1D = new int[5];
        // int[] arr2 = {1,2,3,4,5};

        // 2D arrays
        // int[][] arr = new int[3][4];
        // int [][] arr = new int[3][4];
        // int [][]arr = new int[3][4];
        // int arr[][] = new int[3][4];
        // int []arr[] = new int[3][4];
        // default value of elements for the above array will be ZERO
        
        int []arr[] = {{1,2,3,10}, {4,5,6, 20}, {7,8,9, 30}}; // array of arrays
        // System.out.println(arr1D[0]);
        System.out.println(arr);// address of 2d array
        System.out.println(arr[0]); // address of 1d array
        System.out.println(arr[0][0]);  // value at 0,0
        System.out.println(arr[1][0]); //value at 1,0
        System.out.println(arr[2][3]); //value at 2,3



    }
}
