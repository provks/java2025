package Java.Oops;

public class FractionalUse {
    public static void main(String[] args) {
        FractionalNumber f1 = new FractionalNumber(8, 24);
        f1.print();
        
        FractionalNumber f2 = new FractionalNumber(2, 9);
        // adding f2 into f1
        // f1.add(f2);
        // f1.print();
        f2.print();

        //  adding f1 and  f2 and return f3 = f1 + f2
        FractionalNumber f3 = FractionalNumber.add(f1,f2);
        f3.print();
    }
}
