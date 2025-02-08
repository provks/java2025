package Java.Methods;

public class Methods {
    public static void main(String[] args) {
        System.out.println("hello methods");
        // printCustomerDetails();
        printCustomerDetails("satyam", "1/1/1999", 1997234235210L);
        int sq3 = squareOfNumber(3);
        System.out.println("square of 3 is " + sq3);
        int ans = 2*sq3;
        System.out.println("ans is: "+ ans);

        System.out.println(sum(2,3));
        // System.out.println(sum(2,"3"));
    }

    // print bank customer details
    // public static void printCustomerDetails() {
    //     System.out.println("Customer name: Varun Sharma");
    //     System.out.println("DOB: 1/1/1997");
    //     System.out.println("Account Number: 1997234235210");
    // }

    // function with arguments
    public static void printCustomerDetails(String name, String dob, long accountNumber) {
        System.out.println("Customer name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Account Number: " + accountNumber);
    }

    public static int squareOfNumber(int num) {
        // System.out.println(num*num);
        int square = num*num;
        return square;
    }

    public static int sum(int a, int b) {
        int sum = a+b;
        return sum;
    } 
}
