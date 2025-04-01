package Java.Recursion2;

public class ReplaceCharacter {

    public static String replaceCharacter(String s, char a, char b) {
        // base case
        if (s.length() == 0) {
            return s;
        }

        // recursive call
        String smallOutput = replaceCharacter(s.substring(1), a, b);

        // small calculation
        if (s.charAt(0) == a) {
            return b + smallOutput;
        } else {
            return s.charAt(0) + smallOutput;
        }
    }

    public static void main(String[] args) {
        String s = "coding ninjas";
        char a = 'i';
        char b = 'x';
        String ans = replaceCharacter(s, a, b);
        System.out.println(ans);
    }
}
