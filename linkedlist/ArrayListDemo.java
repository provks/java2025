package Java.linkedlist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // creating array list
        ArrayList<Integer> arr = new ArrayList<>();

        // insert an element in arraylist
        arr.add(10);
        arr.add(20);
        arr.add(30);

        // get elements
        System.out.println(arr.get(1));
        // System.out.println(arr.get(-1));

        // size
        System.out.println(arr.size());

        // add element at a specific index (variation of insert element) [elements will be shifted to right]
        arr.add(1, 80);

        System.out.println(arr.get(1));
        System.out.println(arr.size());

        // set: replace element [size remains the same.]
        arr.set(1, 100);
        System.out.println(arr.get(1));
        System.out.println(arr.size());

        // remove: to remove an element 
        arr.remove(1);  // remove by the index
        Integer v = 10;
        arr.remove(v);  // remove by the value
        System.out.println(arr.get(1));
        System.out.println(arr.size());

        // priting the ArrayList
        for (int i = 0; i < arr.size(); i++) {      // i is index
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        // for each
        for (Integer i : arr) { //i is the value
            System.out.print(i + " ");
        }
    }
}
