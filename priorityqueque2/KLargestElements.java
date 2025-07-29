package Java.priorityqueque2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElements {

    public static ArrayList<Integer> kLargest(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		// Min heap to store the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : input) {
            if (minHeap.size() < k) {
                // Fill up the heap till it has k elements
                minHeap.add(num);
            } else if (num > minHeap.peek()) {
                // If the new number is larger than the smallest in the heap, replace it
                minHeap.poll();  // Remove the smallest
                minHeap.add(num);
            }
        }

        // Now the heap contains k largest elements
        // Convert it into an ArrayList and return
        return new ArrayList<>(minHeap);
	}

    public static void main(String[] args) {
        int arr[] = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        
        ArrayList<Integer> kLargestElementsArr = kLargest(arr, 6);
        
        for (int elem : kLargestElementsArr) {
            System.out.println(elem);
        }
    }
}
