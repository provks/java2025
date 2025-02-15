package Java.Arrar1Part2;

public class Arrays {
    public static void main(String[] args) {
        // FINDING THE MAXIMUM IN AN ARRAY
        // int arr[] = {10, 50, 2, 11, 4};
        // output -> 11
        // int max = Integer.MIN_VALUE;
        // int max = arr[0];

        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        //  FINDING THE MAXIMUM IN AN ARRAY
        int arr[] = {9, 12, 11, 7, 4};
        int secondLargest = findSecondLargest(arr);
                System.out.println(secondLargest);
    }

    public static int findSecondLargest(int arr[]) {
        int max = arr[0];
        int max2 = max;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            }
            else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }
    
}
