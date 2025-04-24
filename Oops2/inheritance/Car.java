package Java.Oops2.inheritance;

public class Car extends Vehicle {
    int numOfDoors;
    int maxSpeed;

    // contstructor and inheritance
    Car(String color, String name) {
        super(color, name);//
        System.out.print("Car's constructor ");
    }

    public void print() {
        super.print();
        System.out.println("Car-> name:" + name + ", color:" + getColor() +", maxSpeed:" + maxSpeed+", numOfDoors:" + numOfDoors);
    }

    public void printMaxSpeed() {
        System.out.println("Car's " + maxSpeed);
        System.out.println("Vehicle's " + super.maxSpeed);
    }
}
