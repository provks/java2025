package Java.Hashmaps2;

import java.util.HashMap;

public class PairSum {
    public static int PairSum(int[] input) {
		// create hashmap
		HashMap<Integer, Integer> freqMap = new HashMap<>();

		int pairCount = 0;
		// iterate over array
		for (int element: input) {
			int opppositeOfCurrentElement = -element;
            // check for opposite key in hashmap
            // if key exists
            // then udpate count by key's value
			if (freqMap.containsKey(opppositeOfCurrentElement)) {
				pairCount = pairCount + freqMap.get(opppositeOfCurrentElement);
			}
			
			// update hashmap, with current element with value 1, if key exists, update value by 1
			if (freqMap.containsKey(element)) {
				int existingValue = freqMap.get(element);
				freqMap.put(element, existingValue+1);
			} else {
				freqMap.put(element, 1);
			}
		}
		return pairCount;
	}

    public static void main(String[] args) {
        int[] arr = {2, 1, -2, 2, 3};
        int pairCount = PairSum(arr);
        System.out.println(pairCount);
    }
}
