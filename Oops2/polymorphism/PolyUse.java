package Java.Oops2.polymorphism;

import java.util.Scanner;

public class PolyUse {
    public static void main(String[] args) {
        // Rectangle r = new Rectangle();
        // Rectangle r2 = new Rectangle(3,4);
        // Circle c = new Circle();
        // c.draw();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Shape s2;
        if (n > 5) {
            s2  = new Circle();

        } else {

            s2 = new Rectangle();
        }
        s2.draw();
        // s2.radius;  // error because every shape doesn't have radius

        // Shape s = new Shape();
        // s.draw();

        // Circle c = new Circle();
        // c.draw();
        
        // Rectangle r = new Rectangle();
        // r.draw();


    }
}
