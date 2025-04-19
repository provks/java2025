package Java.Oops;

public class FractionalNumber {
    // properties
    int numerator;
    int denominator;

    // constructor
    public FractionalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }

    // to print fractional numbers
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    // add function
    public void add(FractionalNumber f2) {
        this.numerator = (this.numerator * f2.denominator) + (this.denominator * f2.numerator);
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public static FractionalNumber add(FractionalNumber f1, FractionalNumber f2) {
        int newNumerator = (f1.numerator * f2.denominator) + (f1.denominator * f2.numerator);
        int newDenominator = f1.denominator * f2.denominator;

        // return fractional number
        FractionalNumber f3 = new FractionalNumber(newNumerator, newDenominator); 
        // simplify();
        return f3;
    }

}
