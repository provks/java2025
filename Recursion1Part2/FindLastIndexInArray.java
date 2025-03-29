package Java.Recursion1Part2;

public class FindLastIndexInArray {
    public static int findLastIndex(int input[], int index, int x) {
		// base case
		if (index < 0) {
			return -1;
		}

		// small calculation
		if ( input[index] == x ) {
			return index;
		}

		// recursive call
		return findLastIndex(input, index-1, x);
	}
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return findLastIndex(input, input.length-1, x);
	}
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 6, 12};
        System.out.println(lastIndex(arr, 6));
    }
}
