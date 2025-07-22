package Java.Hashmaps2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PrintIntersection {
	public static void printIntersection(int[] arr1, int[] arr2) {
            // Step 1: Store frequencies of arr1 elements
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    
            for (int num : arr1) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
    
            // Step 2: Find intersection elements based on frequency
            ArrayList<Integer> intersectionArr = new ArrayList<>();
    
            for (int num : arr2) {
                if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                    intersectionArr.add(num);
                    frequencyMap.put(num, frequencyMap.get(num) - 1); // reduce count
                }
            }
    
            // Step 3: Sort the intersectionArr list
            Collections.sort(intersectionArr);
    
            // Step 4: Print the result
            for (int num : intersectionArr) {
                System.out.println(num);
            }
        }

        public static void main(String[] args) {
            int[] arr1 = {2, 6, 8, 5, 4, 3};
            int[] arr2 = {4, 7, 2, 3};
            printIntersection(arr1, arr2);
        }
}
