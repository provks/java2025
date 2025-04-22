package Java.Oops2.temp;

import Java.Oops2.inheritance.Vehicle;

public class VehicleUse2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        // Unable to access (outside package)
        // System.out.println(v.maxSpeed);
        // System.out.println(v.name);
        // System.out.println(v.color);

    }
}
