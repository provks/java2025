package Java.Operators2;

public class Operators {
    public static void main(String[] args) {
        // UNARY OPERATOR (+, -, ++, --, !)
        // int a = 10;
        // System.out.println(a);
        // a = a+1;
        // a += 1;
        // a++; //(post increment)
        // System.out.println(a++);
        // System.out.println(a);
        // System.out.println(++a); // pre increment

        // Not operator (!)
        // boolean boo = true;
        // System.out.println(!!boo);

        // COMPARISON OPERATORS (<, >, <=, >=, ==, !=) {result -> boolean}
        int a = 10;
        int b = 20;
        // System.out.println(a==b);      // false
        // System.out.println(a!=b);      // true
        // System.out.println(a<=b);       // true
        // System.out.println(a>=b);       // false
        // System.out.println(a<b);        // true
        // System.out.println(a>b);        // false



        // LOGICAL OPERATORS (&&, ||, !) {result -> boolean}
        // true && true -> true
        // if either side true -> true
        int x = 10;
        int y = 15;
        int z = 20;
        boolean isXGreatest = (x>y && x>z);
        boolean isYGreatest = (y>x && y>z);
        boolean isZGreatest = (z>y && z>x);
        // System.out.println(isXGreatest);
        // System.out.println(isYGreatest);
        // System.out.println(isZGreatest);

        // BITWISE OPERATORS (&, |, ^, ~, <<, >>, >>>)
        // &
        int aa = 5;     // 0101        
        int bb = 7;     // 0111
                        // 0101 -> 5
        // System.out.println(5&7); //5       
        int cc = 3;     // 0011
                        // 0001 -> 1
        // System.out.println(aa&cc);
        // System.out.println(aa|cc);  //0111 ->


        // << (left shift), >> (signed right shift), >>> (unsigned right shift)
        System.out.println(4 << 1); //8
        System.out.println(4 >> 1); //2
        System.out.println(4 >>> 1); //2
        System.out.println(-4 << 1); //-8
        System.out.println(-4 >> 1);// -2
        System.out.println(-4 >>> 1); // 2nd largest int
        System.out.println(Integer.MAX_VALUE);


    }
}
