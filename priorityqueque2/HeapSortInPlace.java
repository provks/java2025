package Java.priorityqueque2;

public class HeapSortInPlace {
	public static void downHeapify(int arr[], int i, int n) {
		int parentIndex = i;

		while (true) {
			int leftChildIndex = 2*parentIndex+1;
			int rightChildIndex = 2*parentIndex+2;
			int minIndex = parentIndex;

			if (leftChildIndex < n && arr[leftChildIndex] < arr[minIndex]) {
				minIndex = leftChildIndex;
			}
			
			if (rightChildIndex < n && arr[rightChildIndex] < arr[minIndex]) {
				minIndex = rightChildIndex;
			}

			// edge case, no need to swap, parent is min among its children
            if( minIndex == parentIndex) {
                break;
            }

			// swap
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[minIndex];
			arr[minIndex] = temp;

			// update parent index
			parentIndex = minIndex;
		}
	}

	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		// step 1: building min heap (in-place)
		for(int i = (arr.length/2)-1; i >= 0 ; i--) {
			// maintain heap order
			downHeapify(arr, i, arr.length);
		}

		// step 2: sorting the array using heap
		for (int i = arr.length-1; i >= 1; i--) {
			// swap top (0th indext) with last element
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// maintain heap order
			downHeapify(arr, 0, i);
        }	
	}

    public static void main(String[] args) {
        int arr[] = {2, 6, 8, 5, 4, 3};
        // sorts array in decreasing order (reverse if reuqired, or use Max Heap instead of Min Heap)
        inplaceHeapSort(arr);
        for (int elem : arr) {
            System.out.println(elem);
        }
    }
}
