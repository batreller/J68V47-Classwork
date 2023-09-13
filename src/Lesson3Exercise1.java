import java.util.Scanner;

public class Lesson3Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter your year of birth YYYY: ");
        String dob = scanner.nextLine();

        String username = firstName.charAt(0) + surname.toLowerCase();
        String password = Character.toLowerCase(surname.charAt(0)) + firstName.substring(0, 3).toUpperCase() + dob;
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
