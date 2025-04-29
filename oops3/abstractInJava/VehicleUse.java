package Java.oops3.abstractInJava;

public class VehicleUse {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); // can't create obeject of abstract class/incomplete class
        // Car c = new Car();
        // Vehicle v;
        // v = new Car();

        Vehicle v = new Tata();
        System.out.println(v.getCompany());
    }
}
