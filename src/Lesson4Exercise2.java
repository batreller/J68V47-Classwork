import java.util.Scanner;

public class Lesson4Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Q1. What is the capital of Spain? ");
        String spain = scanner.nextLine();
        if (!spain.equalsIgnoreCase("madrid")) {
            System.out.println("Sorry, the correct answer is Madrid.");
        }

        System.out.print("Q1. What is the capital of UK? ");
        String uk = scanner.nextLine();
        if (!uk.equalsIgnoreCase("london")) {
            System.out.println("Sorry, the correct answer is London.");
        }

        System.out.print("Q1. What is the capital of Italy? ");
        String rome = scanner.nextLine();
        if (!rome.equalsIgnoreCase("rome")) {
            System.out.println("Sorry, the correct answer is Rome.");
        }
    }
}
