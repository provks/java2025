package Java.oops3.interfaceInJava;

public class Vehicle implements InterfaceVehicle {
    void print() {
        System.out.println("Vehicle's print method");
    }

    @Override
    public boolean isMotorized() {
        return false;
     }

    @Override
    public String getCompany() {
        return null;
    }
    
}
