import java.util.Scanner;

public class Lesson3Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Q1. What is the capital of Spain? ");
        String spain = scanner.nextLine();
        System.out.println(spain.equalsIgnoreCase("madrid"));

        System.out.print("Q1. What is the capital of UK? ");
        String uk = scanner.nextLine();
        System.out.println(uk.equalsIgnoreCase("london"));

        System.out.print("Q1. What is the capital of Italy? ");
        String rome = scanner.nextLine();
        System.out.println(rome.equalsIgnoreCase("rome"));
    }
}
