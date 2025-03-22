package Java.SearchingAndSorting.Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
         // loop for pass
         for (int i = 0; i < n-1; i++) {
            // for comparing elements
            for (int j = 0; j < n-1-i; j++) {
                // comparison
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        bubbleSort(arr, arr.length);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
