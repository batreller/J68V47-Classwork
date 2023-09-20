import java.util.Scanner;

public class Lesson4Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter total amount of your order: £");
        double orderAmount = scanner.nextDouble();
        System.out.print("Enter the amount you wist to pay as deposit: £");
        double deposit = scanner.nextDouble();

        System.out.println("== RECEIPT ==");
        System.out.printf("Customer: %s %s%n", firstName.charAt(0), surname);
        System.out.printf("Order Total £%.2f%n", orderAmount);
        System.out.printf("Deposit Paid £%.2f%n", deposit);
        System.out.printf("Reminder £%.2f%n", orderAmount - deposit);
        System.out.printf("Reminder £%.2f%n", orderAmount - deposit);
        if (deposit > 100) {
            System.out.println("You get a free toaster!");
        }
        System.out.println("Have a nice day");
    }
}
