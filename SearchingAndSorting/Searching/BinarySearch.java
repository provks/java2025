package Java.SearchingAndSorting.Searching;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        int steps = 0;
        while (l <= r) {
            steps++;
            //find mid index
            int midIndex = (l+r)/2;

            //compare value with target
            int element = arr[midIndex];
            if (element == target) {
                System.out.println("Binary Steps: " + steps);
                return midIndex;
            } else if (element < target) {
                // update left
                l = midIndex+1;
            } else {
                // element > target, update right
                r = midIndex-1;
            }
        }
        System.out.println("Binary Steps: " + steps);
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,6,8,11,19,26,32,35,44};
        
        int arr2[] = new int[100000];
        int target = 10;
        
        int ansIndex = binarySearch(arr2, target);
        int index = LinearSearch.linearSearch(arr2, target);
        
        System.out.println("Found element with BinarySearch at index: "+ ansIndex);
        System.out.println("Found element with Linear at index: "+ index);
    }
}
