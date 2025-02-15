package Java.Arrar1Part2;

public class Swap {
    public static void main(String[] args) {
        int arr[] = {9, 3, 6, 12, 4, 32};
        for (int i = 0 ; i < arr.length; i = i+2) {
            // swap values
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
