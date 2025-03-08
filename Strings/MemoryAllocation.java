package Java.Strings;

public class MemoryAllocation {
    public static void main(String[] args) {
        // String s1 = "Java";
        // String s2 = "java";
        // String s3 = "Java";

        // Printing the memory address
        // System.out.println("s1: " + System.identityHashCode(s1));
        // System.out.println("s2: " + System.identityHashCode(s2));
        // System.out.println("s3: " + System.identityHashCode(s3));

        // check equality (comparing reference)
        // System.err.println(s1 == s3);   // true
        // System.err.println(s1 == s2);   // false
        // System.err.println(s2 == s3);   // false

        // String str1 = new String("Java");
        // String str2 = new String("java");
        // String str3 = new String("Java");

        // System.out.println("str1: " + System.identityHashCode(str1));
        // System.out.println("str2: " + System.identityHashCode(str2));
        // System.out.println("str3: " + System.identityHashCode(str3));


        // STRING ARE IMMUTABLE
        // String s5 = "java";
        // System.out.println("s5: " + System.identityHashCode(s5));
        // s5 = s5 + " is";
        // System.out.println("updated s5: " + System.identityHashCode(s5));
        // s5 = s5 + " fun!";
        // System.out.println("updated again s5: " + System.identityHashCode(s5));

        // ARRAYS ARE MUTABLE
        // char ch[] = {'a', 'b', 'c'};
        // System.out.println(ch);
        // System.out.println(ch.toString());
        
        // ch[2] = 'z';
        // System.out.println(ch);
        // System.out.println(ch.toString());


        // use StringBuffer
        StringBuffer sb0 = new StringBuffer("Java");
        System.out.println(sb0.capacity());
        StringBuffer sb = new StringBuffer("Java");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println("sb: " + System.identityHashCode(sb));
        sb.append(" is fun df;alkjfas; a;lkdjf;ladksdjf as;lfj !");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println("sb: " + System.identityHashCode(sb));


    }
}
