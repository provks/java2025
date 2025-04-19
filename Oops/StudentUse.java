package Java.Oops;

public class StudentUse {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // creating objects/instance of the class
        // Student s1 = new Student();
        // Student s2 = new Student();

        // s1 and s2 holds reference of the instance/object
        // System.out.println(s1);
        // System.out.println(s2);

        // how to get the value
        // System.out.println("s1 name: " + s1.name);
        // System.out.println("s1 rollNo: " + s1.rollNo);
        // System.out.println("s1 rollNo: " + s1.address); // address is private property

        // update the value of properties/attribute
        // s1.name = "piyush";
        // s1.rollNo = 33;

        // System.out.println("s1 name: " + s1.name);
        // System.out.println("s1 rollNo: " + s1.rollNo);

        // s2.name = "Arbaz";
        // s2.rollNo = 1;
        
        // System.out.println("s2 name: " + s2.name);
        // System.out.println("s2 rollNo: " + s2.rollNo);

        // calling class method
        // s1.print();
        // s2.print();

        // Getter and Setter
        // accessing private address with getter
        // System.out.println("Address S1: " + s1.getAddress());
        
        // setter
        // s1.setAddress("Delhi");
        // System.out.println("Address S1: " + s1.getAddress());
        
        // s2.setAddress("Mumbai");
        // System.out.println("Address S2: " + s2.getAddress());

        // accessing final property
        // System.out.println(s1.conversionFactor);

        // updating static property
        // System.out.println(Student.TOTAL_STUDENTS);
        // Student.TOTAL_STUDENTS = 20;
        // System.out.println(Student.TOTAL_STUDENTS);
        // System.out.println(s1.getTotalStudents());
        // Student.TOTAL_STUDENTS = 20;
        // Student s3 = new Student();
        // System.out.println(s1.getTotalStudents());

        // calling the static function on the class
        System.out.println(Student.getTotalStudents());

    }
}
