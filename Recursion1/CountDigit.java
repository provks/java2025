package Java.Recursion1;

public class CountDigit {
    public static int countDigits(int n){
        // base case
        if (n == 0) {
            return 0;
        }

        // recursive call
        int smallOutput = countDigits(n/10);

        // small calc
        int output = 1 + smallOutput;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(5));
    }
}
