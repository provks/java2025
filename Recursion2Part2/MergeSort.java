package Java.Recursion2Part2;

public class MergeSort {
    public static void mergeSortedArrays(int[] a, int[] b, int[] c) {
        int i=0, j=0, k=0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }

        // copy the elements of the remaining array
        while (i < a.length) {
            c[k] = a[i];
                k++;
                i++;
        }

        while (j < b.length) {
            c[k] = b[j];
                k++;
                j++;
        }
    }

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        // base case
        if (arr.length <= 1) {
            return;
        }
        // create arrays a and b
        int a[] = new int[arr.length/2];    // left array
        int b[] = new int[arr.length -a.length]; // right array

        // copy elements into a
        for (int i = 0; i < arr.length/2; i++) {
            a[i] = arr[i];
        }

        // copy elements into b
         for (int i =  arr.length/2; i < arr.length; i++) {
            b[i-arr.length/2] = arr[i];
        }

        // recursive call
        mergeSort(a, l, r);
        mergeSort(b, l, r);

        // merge sorted arrays a and b
        mergeSortedArrays(a, b, arr);
    }

    public static void main(String[] args) {
        int[] arr = {5,7,2,5,1,11,8};
        mergeSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
