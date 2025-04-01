package Java.Recursion2;

public class RemoveX {
    public static String removeX(String input){
		// Write your code here
		// base case
		if (input.length() == 0) {
			return input;
		}

		// recursive call
		String smalloutput = removeX(input.substring(1));

		// small calculation
		if (input.charAt(0) == 'x') {
			return smalloutput;
		} else {
			return input.charAt(0) + smalloutput;
		}

	}
    
    public static void main(String[] args) {
        String str = "cxdxng nxxnjxs";
        String ans = removeX(str);
        System.out.println(ans);
    }
    
}
