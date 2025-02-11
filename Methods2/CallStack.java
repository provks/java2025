package Java.Methods2;

public class CallStack {
    public static void main(String[] args) {
        System.out.println("Inside main");
        a();
        System.out.println("Exiting main");
    }
        
    public static void a() {
        b();
        System.out.println("Inside a");
    }
    public static void b() {
        System.out.println("Inside b");
    }


}
