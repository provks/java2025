package Java.Oops2.inheritance;

public class Car extends Vehicle {
    int numOfDoors;

    public void printCar() {
        System.out.println("Car-> name:" + name + ", color:" + getColor() +", maxSpeed:" + maxSpeed+", numOfDoors:" + numOfDoors);
    }
}
