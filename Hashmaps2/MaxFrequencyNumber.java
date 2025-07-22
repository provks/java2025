package Java.Hashmaps2;

// import java.util.ArrayList;
import java.util.HashMap;
// import java.util.Set;

public class MaxFrequencyNumber {

    public static int maxFrequencyNumber(int[] arr){ 
		HashMap<Integer, Integer> freqMap = new HashMap<>();
		for (int i=0; i < arr.length; i++) {
			if(freqMap.containsKey(arr[i])) {
				// increase value by 1
				freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
			} else {
				freqMap.put(arr[i], 1);
			}
		}

		// Set<Integer> keys =  freqMap.keySet();
		// int maxValue = 0;
		// int maxKey = arr[0];
		// for(int key: keys) {
		// 	if(maxValue < freqMap.get(key)) {
		// 		maxKey = key;
		// 	}
		// }
		// return maxKey;

		int maxFrequency = 0;
		int maxKey = arr[0];
		for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int freq = freqMap.get(key);

            // If we find a number with higher frequency, update result
            if (freq > maxFrequency) {
                maxFrequency = freq;
                maxKey = key;
            }
        }
		return maxKey;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6};
        int ans = maxFrequencyNumber(arr);
        System.out.println(ans);
    }
}
