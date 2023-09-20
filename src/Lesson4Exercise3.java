import java.util.Scanner;

public class Lesson4Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shipping = 10;
        System.out.print("Enter your total purchase amount: £");
        double amount = scanner.nextDouble();

        if (amount >= 50) {
            shipping = 0;
        }
        System.out.printf("Shipping cost is = %.2f%n", shipping);
        System.out.printf("Your final cost is = %.2f", amount + shipping);
    }
}
