import java.util.Random;
import java.util.Scanner;

public class Lesson5Extra2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int ATTEMPTS_AMOUNT = 3;
        int answer = rand.nextInt(10);

        for (int i = 0; i < ATTEMPTS_AMOUNT; i++) {
            System.out.print("Guess the number... ");
            int numberToCheck = scanner.nextInt();
            if (answer == numberToCheck) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.printf("Incorrect, attempts left: %d%n", ATTEMPTS_AMOUNT-i-1);
            }
        }

    }
}
