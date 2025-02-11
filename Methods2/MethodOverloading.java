package Java.Methods2;

public class MethodOverloading {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int sum1 = sum(x, y);
        int sum2 = sum(x, y, 30);
        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        double sum3 = sum(4.1, 3.0);
        System.out.println("sum3: " + sum3);
    }

    public static int sum(int a, int b) {
        return a+b;
    }
    
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    
    public static double sum(double a, double b) {
        return a+b;
    }
}
