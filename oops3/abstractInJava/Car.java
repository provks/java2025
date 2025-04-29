package Java.oops3.abstractInJava;

public abstract class Car extends Vehicle {
    int numOfDoors;
    boolean hasAutomaticTransmission;

    public Car() {
        System.out.println("Car's contructor");
    }

     public void print() {
        System.out.println("Car's color: " + super.getColor() + " maxspeed is " + super.maxSpeed);
    }

    //  @Override
     public boolean isMotorized() {
        return true;
     }
}
