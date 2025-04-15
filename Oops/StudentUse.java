package Java.Oops;

public class StudentUse {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // creating objects/instance of the class
        Student s1 = new Student();
        Student s2 = new Student();

        // s1 and s2 holds reference of the instance/object
        System.out.println(s1);
        System.out.println(s2);

        // how to get the value
        System.out.println("s1 name: " + s1.name);
        System.out.println("s1 rollNo: " + s1.rollNo);
        System.out.println("s1 rollNo: " + s1.address);

        // update the value of properties/attribute
        s1.name = "piyush";
        s1.rollNo = 33;

        System.out.println("s1 name: " + s1.name);
        System.out.println("s1 rollNo: " + s1.rollNo);

        s2.name = "Arbaz";
        s2.rollNo = 1;
        
        System.out.println("s2 name: " + s2.name);
        System.out.println("s2 rollNo: " + s2.rollNo);

        // calling class method
        s1.print();
        s2.print();



    }
}
