package Java.Recursion2;

public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		// base case
		if(s.length() == 0) {
			return s;
		}

		// recursive call
		String smallOutput = removeConsecutiveDuplicates(s.substring(1));

		// small calculation
		if (smallOutput.length() > 0 && s.charAt(0) == smallOutput.charAt(0)) {
			return smallOutput;
		} else {
			return s.charAt(0) + smallOutput;
		}

	}
    public static void main(String[] args) {
        String s = "aabccba";
        System.out.println(removeConsecutiveDuplicates(s));
    }
}
