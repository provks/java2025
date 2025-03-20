package Java.SearchingAndSorting.Searching;

public class FindClosestIndex {

    public static int binarySearchClosest(int []nums, int left, int right, int target) {
        //Your code goes here
        int difference = Integer.MAX_VALUE;
        int diffIndex = -1;

        while (left <= right) {
            // find mid index
            int midIndex = (left+right)/2;

            // compare with target
            int absDiffValue = Math.abs(nums[midIndex] - target);
            if (absDiffValue < difference) {
                difference = absDiffValue; 
                diffIndex = midIndex;
            } else if (nums[midIndex] < target){
                // update left
                left = midIndex+1;
            } else {
                // update right
                right = midIndex-1;
            }
        }
        return diffIndex;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 9, 11, 12, 45};
        int index = binarySearchClosest(arr,0, arr.length-1, 4);
        System.out.println("Closest index is: "+ index);
    }
}
