package Java.oops3.interfaceInJava;

public class VehicleUse {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle();
        
        // Vehicle v = new InterfaceVehicle();
        InterfaceVehicle vI;
        // vI = new Vehicle();
        vI = new Car();
        vI.getCompany();
        // vI.print(); // compile time error: can access only the properties/methods that are present in the interface.
        Vehicle v = new Vehicle();
        v.print();
    }
}
