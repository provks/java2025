package Java.Oops2.inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.name = "Atlas";
        // v.color = "black";
        v.maxSpeed = 48;
        // System.out.println("Vehicle: " + v.name + ", " + v.color +", " + v.maxSpeed );
        v.print();

        Car c = new Car();
        c.name = "Maruti";
        // c.color = "White";
        c.setColor("White");
        c.maxSpeed = 127;
        c.numOfDoors = 5;
        c.print();
        System.out.println("Car: " + c.numOfDoors + ", " + c.name + ", " + c.getColor() +", " + c.maxSpeed);
        c.printCar();

        Bike b = new Bike();
        b.hasPillionSeat = true;
        b.name = "Hero";
        // b.color = "blue";
        b.setColor("blue");
        b.print();
        System.out.println("Bike: " + b.hasPillionSeat + ", " + b.name + ", " + b.getColor() +", " + b.maxSpeed);

    }
    
}
