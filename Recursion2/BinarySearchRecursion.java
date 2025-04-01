package Java.Recursion2;

public class BinarySearchRecursion {

    public static int binarySearchRecursion(int[] arr, int si, int ei, int x) {
        // base case
        if (si > ei) {
            return -1;
        }

        // small calc
        // find mid
        int midIndex = (si+ei)/2;
        if (arr[midIndex] == x) {
            return midIndex;
        } else if (arr[midIndex] < x) {
            // recursive call on the right side of the array
            return binarySearchRecursion(arr, midIndex+1, ei, x);
        } else {    // arr[midIndex] > x
            // recursive call on the leeft side of the array mid element
            return binarySearchRecursion(arr, si, midIndex-1, x);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,11,14};
        int indexFound = binarySearchRecursion(arr, 0, arr.length-1, 3);
        System.out.println(indexFound);
    }
}
