package Java.Oops2.exceptions;

public class ExceptionDemo {

    // pass the exception
    // public static int divide(int a, int b) throws DivideByZeroException{
    //     // raise an exception
    //     if (b == 0) {
    //         // throw new ArithmeticException();
    //         throw new DivideByZeroException();

    //     }
    //     return a/b;
    // }

    //  passing the exception
    // public static void main(String[] args) throws DivideByZeroException{
    //     System.out.println("Coding");
    //     // System.out.println(7/0);
    //     System.out.println(divide(7, 0));
    //     System.out.println("Ninjas");   // not printing because disruption of code execution due to exception

    // }


    // Hanlde exception
    
    public static int divide(int a, int b) throws DivideByZeroException{
        // raise an exception
        if (b == 0) {
            // throw new ArithmeticException();
            throw new DivideByZeroException();

        }
        return a/b;
    }

    // handle exception in main method
    public static void main(String[] args){
        System.out.println("Coding");
        // System.out.println(7/0);
        try {
            System.out.println("Before exception");
            int[] arr = {1,2,3,4};
            // System.out.println(arr[9]);
            String s = null;
            Math.abs(100);
            // s.length();
            System.out.println(divide(7, 8));
            System.out.println("After exception");
            
        } catch (DivideByZeroException e) {
            System.out.println("Divide by zero exception raised!");
        } catch (NullPointerException e) {
            System.out.println("Null String length can't be possible, null string exception raised!");
        } catch (Exception e) {
            System.out.println("Exception raised!");
        } finally {
            System.out.println("Executed always!");
            // close the scanner
            //
        }
        System.out.println("Ninjas");   // not printing because disruption of code execution due to exception

    }
}
