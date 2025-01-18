package Java.FundamentalsOfJava;
import java.lang.System;

public class Literals {
    public static void main(String[] args) {
        // LITERALS
        // int a = 10;
        // System.out.println(a);
        // int b = 0b1010; // binary
        // System.out.println(b);

        // //octal
        // int octal = 010;
        // System.out.println(octal);
        
        // //hexadecimal
        // int hex = 0x64;
        // System.out.println(hex);

        long l = 19_023_487_519_234_85_7l;
        System.out.println(l);
        float f = 19.0_2_33f;
        System.out.println(f);

        double d = 1e-8;
        d = 2e19;
        System.out.println(d);

        // char c = 'a';
        int c = 'a';
        // c = 97;
        System.out.println(c);

        char nextLine = '\n';
        System.out.println(nextLine);
        char unicode = '\u0394';
        System.out.println(unicode);


    }
}
