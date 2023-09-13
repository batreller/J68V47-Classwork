import java.util.Scanner;
import java.lang.Math;

public class Lesson3Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan amount: £");
        double amount = scanner.nextDouble();
        System.out.print("Interest Rate (APR %): ");
        double apr = scanner.nextDouble();
        System.out.print("Number of years: ");
        double years = scanner.nextDouble();

        double j = apr / 1200;

        double monthlyPayment = amount * (j / (1 - Math.pow(1 + j, -years * 12)));
        System.out.printf("Monthly payment for this loan - £%.2f", monthlyPayment);
    }
}
