package Java.oops3.abstractInJava;

public abstract class Bike extends Vehicle {
    public Bike() {
        System.out.println("Bike's contructor");
    }

     public void print() {
        System.out.println("Bike's color: " + super.getColor() + " maxspeed is " + super.maxSpeed);
    }

     @Override
     public boolean isMotorized() {
        return true;
     }
}
