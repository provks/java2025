package Java.Operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Operators in java");

        // Assignment operator (=)
        int i = 10;
        // System.out.println(i);
        i = i+1;
        // System.out.println(i);

        // Arithmatic operators (+, -, *, /, %)
        int a = i + 1;
        // System.out.println(a);
        // System.out.println(100 + 10);   //110
        // System.out.println(100 - 10);   // 90
        // System.out.println(100 * 10);   // 1000
        // System.out.println(100 / 10);   // 10
        // System.out.println(100 % 10);   // 0 (modulus operator return remainder)

        int b = a + 40; // 52
        // System.out.println(b);

        // multiple operators in one statements (precendence)
        int x = 8, y=7, z = 6;
        System.out.println(x/y);
        System.out.println(x/(y+z)+3*3/3);    // 17


        // Type casting
        // Implicit/Automatic (Widening)
        short age = 20;
        double age2 = 20;
        age2 = age; // implicit
        
        // Explicit/Manual (Narrowing)
        age = (short)age2;  // explicit
        System.out.println(age);

        long l = 100;
        int in = (short)l;


        short currentYear = 2025;
        byte pAge = 33;
        // find birthyear?
        short birthyear = (short)(currentYear - pAge);
        System.out.println(birthyear);

        int num = 1;
        long long1 = 559809870970980070l;
        int result = num+ (int)long1;
        System.out.println(result);

        // 
        int num2 = 3;
        double res = num/(float)num2;
        System.out.println((double)num2);
        System.out.println(res);
        
        


    }
}