package Java.Recursion1Part2;

public class SumOfArray {
    public static int findArraySum(int input[], int index){
		// base case
		// if (index == input.length) {
		// 	return 0;
		// }
		if (index == input.length-1) {
			return input[input.length-1];
		}

		// recursive call
		int remaningSum = findArraySum(input, index+1);

		// small calculation
		int totalSum = input[index] + remaningSum;
		return totalSum;
	}

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return findArraySum(input, 0);
		
	}
    public static void main(String[] args) {
        int[] arr = {3,6,9,12};
        System.out.println(sum(arr));
    }
}
