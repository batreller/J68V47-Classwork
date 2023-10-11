import java.util.Random;
import java.util.Scanner;

public class Lesson7Extra2 {
    public static int getRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(++bound);
    }

    public static void easyProblem() {
        Scanner scanner = new Scanner(System.in);

        int num1 = getRandomNumber(20);
        int num2 = getRandomNumber(20);
        System.out.printf("%d + %d = ", num1, num2);
        int userAnswer = scanner.nextInt();
        if (userAnswer == num1 + num2) {
            System.out.println("Correct!");
        } else {
            System.out.printf("Wrong! The answer was %d%n", num1 + num2);
        }
    }

    public static void hardProblem() {
        Scanner scanner = new Scanner(System.in);

        int num1 = getRandomNumber(100);
        int num2 = getRandomNumber(100);
        System.out.printf("%d * %d = ", num1, num2);
        int userAnswer = scanner.nextInt();
        if (userAnswer == num1 * num2) {
            System.out.println("Correct!");
        } else {
            System.out.printf("Wrong! The answer was %d%n", num1 * num2);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Easy math problems\n2. Hard math problems\n3. Quit");

            choice = scanner.nextInt();
            if (choice == 1) {
                easyProblem();
            } else if (choice == 2) {
                hardProblem();
            } else if (choice == 3) {
                System.out.println("Leaving...");
            } else {
                System.out.println("Wrong input! Select number from 1 to 3");
            }

        } while (choice != 3);
    }
}
