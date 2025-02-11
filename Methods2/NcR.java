package Java.Methods2;

import java.util.Scanner;

public class NcR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        scan.close();
        ncr(n, r);
        
    }

    public static void ncr(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n-r);
        System.out.println("nFact: " + nFact);
        System.out.println("rFact: " + rFact);
        System.out.println("nrFact: " + nrFact);

        int ans = nFact / (rFact * nrFact);
        System.out.println(ans);
    }
    
    public static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}
