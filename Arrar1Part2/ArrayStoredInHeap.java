package Java.Arrar1Part2;

public class ArrayStoredInHeap {
    public static void main(String[] args) {
        int x = 10;
        x++;
        int y = x;
        y++;
        System.out.println(x);
        System.out.println(y);

        // Arrays
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("arr -> " + arr);
        int arr1[] = arr;
        System.out.println("arr1 -> " + arr1);
        // int arr[] = {1, 2, 3, 4, 5};
        arr1[0] = 10;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr1) {
            System.out.print(i + " ");
        }

    }
}
