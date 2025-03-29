package Java.Recursion1Part2;

import java.util.Scanner;

public class CaclulatePower {

    public static int power(int x, int n) {
		// base case
		if (n == 0) {
			return 1;
		}

		// recursive call
		int smallOuput = power(x, n-1);
		
		// small calculation
		int output = x * smallOuput;

		return output;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close(); 
        int ans = power(x,n);
        System.out.println(ans);
    }
}
