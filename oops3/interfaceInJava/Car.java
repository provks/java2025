package Java.oops3.interfaceInJava;

public class Car extends Vehicle implements InterfaceVehicle, InterfaceCar {
    @Override
    public boolean isMotorized() {
        return false;
     }

    @Override
    public String getCompany() {
        return null;
    }

    void print() {
        System.out.println("Car");
        // System.out.println(PI);
    }

    @Override
    public int getNumberOfGears() {
        return 5;
    }
}
