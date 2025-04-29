package Java.oops3.abstractInJava;

public abstract class Vehicle {
    private String color;
    int maxSpeed;

    public Vehicle() {
        color = "red";
        System.out.println("Vechicle's Contructor");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println("Vehicle's color: " + color + " maxspeed is " + maxSpeed);
    }

    public abstract boolean isMotorized();
    public abstract String getCompany();
}
