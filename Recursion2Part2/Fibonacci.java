package Java.Recursion2Part2;

public class Fibonacci {
    public static int fib(int n) {
        // base case
        // if (n == 1 || n == 0) {
        //     return 1;
        // }

        if (n == 1) {
            return 1;
        }

        if (n == 0) {
            return 1;
        }

        // recursive calls
        int rec1 = fib(n-1);
        int rec2 = fib(n-2);

        // small calculation
        int ans = rec1+rec2;
        return ans;
    }
    public static void main(String[] args) {
        int ans = fib(5);
        System.out.println(ans);
    }
}
