import java.util.Random;
import java.util.Scanner;

public class Lesson7Extra1 {
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public static void main(String[] args) {
        int lives = 3;
        int score = 0;
        int count = 10;
        while (count > 0 && lives > 0) {

            Scanner scanner = new Scanner(System.in);
            int num1 = getRandomNumber();
            int num2 = getRandomNumber();

            System.out.printf("What is %d + %d? ", num1, num2);
            if (scanner.nextInt() == num1 + num2) {
                System.out.printf("Correct! You score is %d%n", ++score);
            } else {
                System.out.printf("Wrong! The answer is %d%n", num1 + num2);
                System.out.printf("You have %d lives left%n", --lives);
            }
            count--;
        }
        if (lives > 0) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
        System.out.printf("Your score is %d", score);

    }
}
