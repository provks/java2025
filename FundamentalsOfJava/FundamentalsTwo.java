package Java.FundamentalsOfJava;

public class FundamentalsTwo {
    public static void main(String[] args) {
        // int avgScore = 342.5;
        // decimal
        // float
        float avg = 40.5f;
        float avgScore = 342.58885558888f;  // 4 bytes, low pricision, upto 6-7 digits, suffix f/F is must
        // double
        double avgScore2 = 342.58885558888; // 8 bytes, high pricision, upto 15 digits, D/d is optional
        System.out.println(avgScore);
        System.out.println(avgScore2);


        // how to store characters/char
        // '' single quotes
        int character = 'a'+1;
        System.out.println(character);
        char c = 'a'+1; // size: 2 bytes
        System.out.println(c);
        // 'c'
        // 'A'

        // Boolean -> true/false
        boolean canVote = false;    // varies 1bit/1byte
        System.out.println(canVote);

        int x = -7;
        System.out.println(x);

    }
}
