package Java.Strings;

import java.util.Scanner;

public class Strings3 {
    public static void main(String[] args) {
        // String str = "Coding in fun!";
        // MORE METHODS
        // indexOf: return index of first occurance of given character
        // System.out.println(str.indexOf('i'));
        // System.out.println(str.indexOf('i', 7));
        // System.out.println(str.indexOf('i', 8));

        // lastIndexOf: return index of last occurance of given character
        // System.out.println(str.lastIndexOf('i'));
        // System.out.println(str.lastIndexOf("fun"));
        // System.out.println(str.lastIndexOf("varun"));

        // compareTo : return the length difference or compares string with their ascii value
        // String s1 = "Hello";
        // String s2 = "HelloW";
        // System.out.println(s1.compareTo(s2));

        // USER INPUT AT RUNTIME
        // next()
        // nextLine()
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(str);

        String str1 = sc.next();
        System.out.println(str1);
        char ch = str1.charAt(0);
        System.out.println(ch);









        
    }
}
