package Java.Oops2.inheritance;

public class Vehicle {
    public String name;
    private String color;
    protected int maxSpeed;

    Vehicle() {
        System.out.print("Vehicle's Contstructor. ");
    }

    // parameterized constructor
    Vehicle(String color, String name) {
        this.name = name;
        this.color = color;
        System.out.print("Vehicle's Param Contstructor. ");

    }

    public void print() {
        System.out.println("Vehicle-> name:" + name + ", color:" + color +", maxSpeed:" + maxSpeed );
    }
    // getter and setter
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
