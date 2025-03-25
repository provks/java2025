package Java.SearchingAndSorting.Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //store current element
            int currentElement = arr[i];
            // compare with left elements
            int j = i-1;
            // for(; arr[j] > currentElement && j >= 0; j--) {
            //     // shift the element to its right by 1 position
            //     arr[j+1] = arr[j];
            // }
            // ++++++++++++++for OR while ++++++++++++++
            while(j >= 0 && arr[j] > currentElement) {
                // shift the element to its right by 1 position
                arr[j+1] = arr[j];
                j--;
            }
            // put currentEmelent at correct position (j+1)
            arr[j+1] = currentElement;
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
