package Java.Oops2.inheritance;

public class Vehicle {
    public String name;
    private String color;
    protected int maxSpeed;

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
