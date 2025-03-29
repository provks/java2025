package Java.Recursion1Part2;

public class FindFirstIndexInArray {
    public static int findFirstIndex(int input[], int index, int x) {
		// base case
		if (index == input.length) {
			return -1;
		}

		// small calculation
		if (input[index] == x) {
			return index;
		}

		// recursive call
		return findFirstIndex(input, index+1, x);
	}

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return findFirstIndex(input, 0, x);
	}
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 9};
        System.out.println(firstIndex(arr, 9));
    }
}
