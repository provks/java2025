package Java.Recursion2Part2;

public class QuickSort {
    public static int partition(int a[], int si, int ei) {
		// 1. pick pivot
		int pivotElement = a[si];

		// 2. Put pivot element at its correct position
		// find the num of elements < pivotElement
		int smallCount = 0;
		for( int i = si; i <= ei; i++) {
			if (a[i] < pivotElement) {
				smallCount++;
			}
		}
		// COMMON MISTAKE
		// a[smallCount] = pivotElement;

		// save element at correct index
		int temp = a[si+smallCount];
		a[si+smallCount] = pivotElement;
		a[si] = temp;

		// 3. move elements < pivotElement to left and elements >= pivotElement to its right
		int i  = si;
		int j = ei;
		while (i < j) {
			if (a[i] < pivotElement) {
				i++;
			} else if (a[j] >= pivotElement) {
				j--;
			} else {
				// i and j to swap
				int temp2 = a[i];
				a[i] = a[j];
				a[j] = temp2;
				i++;
				j--;
			}
		}

		//  return pivot element's index
		return si+smallCount;
	}
	
	public static void quickSort(int[] input,int startIndex, int endIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		// base case
		if (startIndex >= endIndex) {
			return;
		}

		// call partition function
		int pivotIndex = partition(input, startIndex, endIndex);

		// recursive call (left)
		quickSort(input, startIndex,pivotIndex-1 );
		// recursive call (right)
		quickSort(input, pivotIndex+1,endIndex );
	}
    public static void main(String[] args) {
        int[] arr = {5,7,2,5,1,11,8};
        quickSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
