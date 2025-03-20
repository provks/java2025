package Java.SearchingAndSorting.Searching;

public class LinearSearch {

    public static int linearSearch(int[] arr, int x) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == x) {
                System.out.println("Linear steps: "+ steps);
                return i;
            }
        }
        System.out.println("Linear steps: "+ steps);
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,70,80,90};
        int x = 7;
        int index = linearSearch(arr, x);
        System.out.println("Element found at index: " + index);
    }
}
