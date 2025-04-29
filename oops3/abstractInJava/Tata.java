package Java.oops3.abstractInJava;

public class Tata extends Car {
    String model;
    Tata() {
        System.out.println("Tata's contructor");
        model = "punch";
    }
    @Override
    public String getCompany() {
        return "Tata";
    }
    

}
