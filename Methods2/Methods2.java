package Java.Methods2;

public class Methods2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int z = 30;
        sum(a, b, z);
        System.out.println("a: " + a);
    }

    public static void sum(int a, int b, int c) {
        a++;
        int sum = a+b+c;
        System.out.println("a-> " + a);
        System.out.println(sum);
    }

}
