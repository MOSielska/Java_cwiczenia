import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumGuess {


    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = (random.nextInt(10)) + 1;

        try {
            System.out.println("Try to guess my number (it's between 1 and 10)...");
            Scanner scanner = new Scanner(System.in);
            int guessedNum = scanner.nextInt();

            if (randomNum == guessedNum) {
                System.out.println("Yes, that's my number!");
            } else if (guessedNum <= 0 || guessedNum > 10) {
                System.out.println("Between 1 and 10, please.");
            } else {
                System.out.println("Sorry, my number was: " + randomNum);
            }
        } catch (InputMismatchException e) {
            System.err.println("Not a number!");
            e.printStackTrace();
        }
    }
}