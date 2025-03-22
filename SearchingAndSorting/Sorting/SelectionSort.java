package Java.SearchingAndSorting.Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        // pass
        for (int i = 0; i < arr.length -1; i++) {
            // set minimum index
            int minIndex = i;
            // comparisons
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
