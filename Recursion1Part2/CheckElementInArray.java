package Java.Recursion1Part2;

public class CheckElementInArray {
    public static boolean checkNum(int input[], int index, int x) {
		// base case
		if (index == input.length) {
			return false;
		}

		// small calculation
		if (input[index] == x) {
			return true;
		}

		return checkNum(input, index+1, x);
	}

	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return checkNum(input, 0, x);
	}
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12};
        System.out.println(checkNumber(arr, 6));
    }
}
