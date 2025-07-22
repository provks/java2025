package Java.Hashmaps2;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,1,3,6,5,2};
        ArrayList<Integer> ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        //create hashmap
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        // create arraylist (unique element)
        ArrayList<Integer> uniqueArr = new ArrayList<>();

        // iterate over arr and insert into freqMap
        for(int element: arr) {
            if (freqMap.containsKey(element)) {
                // udpate the value by 1
                int existingValue = freqMap.get(element);
                freqMap.put(element, existingValue + 1);
            } else {
                // insert element as key into hashmap and value as 1
                freqMap.put(element, 1);
                uniqueArr.add(element);
            }
        }
        return uniqueArr;
    }
}
