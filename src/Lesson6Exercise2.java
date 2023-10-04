import java.util.Scanner;

public class Lesson6Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Say hello\n2. Tell me the time\n3. Tell me the joke\n4. Quit");
        String input = scanner.nextLine();
        while (!input.equals("4")) {
            System.out.println("you clicked " + input);
            System.out.println("1. Say hello\n2. Tell me the time\n3. Tell me the joke\n4. Quit");
            input = scanner.nextLine();
        }
    }
}
