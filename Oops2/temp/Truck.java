package Java.Oops2.temp;

import Java.Oops2.inheritance.Vehicle;

public class Truck extends Vehicle {
    double maxLoadCapacity;

    // able to access (because of sub/child/derived class)
    public void printTruck() {
        System.out.println("Truck-> name:" + name + ", color:" + getColor() +", maxSpeed:" + maxSpeed+", maxLoadCapacity:" + maxLoadCapacity);
    }

}
