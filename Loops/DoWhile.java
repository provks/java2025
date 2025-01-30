package Java.Loops;

import java.util.Scanner;
import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int randomNum = 4;
        Random random = new Random();
        int randomNum = random.nextInt(11);
        System.out.println(randomNum);
        int guessedNum;
        do {
            System.out.println("Guess a number between 1 to 10");
            guessedNum = sc.nextInt();
        } while (guessedNum != randomNum);
        System.out.println("that's the right number");


        sc.close();

    }
}
