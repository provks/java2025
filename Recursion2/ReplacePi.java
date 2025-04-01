package Java.Recursion2;

public class ReplacePi {

    public static String replacePi(String s) {
        // base case
        if (s.length() <= 1) {
            return s;
        }

        // small calculation
        if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
            // recursive call
            String smallOuput = replacePi(s.substring(2));
            return "3.14" + smallOuput;
        } else {
             // recursive call
             String smallOuput = replacePi(s.substring(1));
             return s.charAt(0) + smallOuput;
        }
    }
    public static void main(String[] args) {
        String s = "ppiippid";
        System.out.println(replacePi(s));
    }
}
