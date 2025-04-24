package Java.Oops2.polymorphism;

public class Rectangle extends Shape {
    int length;
    int breadth;
    
    Rectangle() {
        System.out.print("Rectanlge's default contructor. ");
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.print("Rectanlge's param contructor. ");
    }

    public void draw() {
        System.out.println("Rectangle drawn");
    }
}
