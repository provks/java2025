package Java.oops3.abstractInJava;

public abstract class Bicycle extends Vehicle {
    public Bicycle() {
        System.out.println("Biclycle's contructor");
    }

    @Override
    public boolean isMotorized() {
        return false;
    }
}
