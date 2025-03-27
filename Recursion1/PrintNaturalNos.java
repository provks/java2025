package Java.Recursion1;

public class PrintNaturalNos {
    public static void print(int n){
		//Write your code here
		// base case
		// if (n == 0) {
		// 	return;
		// }
		if (n == 1) {
			System.out.print(1 + " ");
			return;
		}

		// recursive call: printing the smaller number
		print(n-1);

		// Small calc: print the currect number
		System.out.print(n + " ");
	}
    public static void main(String[] args) {
        print(5);
    }
    
}
