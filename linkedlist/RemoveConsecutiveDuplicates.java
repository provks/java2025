package Java.linkedlist;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {

    public static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        // insert element at 0th index
        list.add(arr[0]);

        // check and insert elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {10, 10, 10, 20, 20, 20, 30, 10};

        ArrayList<Integer> ans = removeConsecutiveDuplicates(arr);

        for (Integer value : ans) {
            System.out.println(value);
        }
    }

}
