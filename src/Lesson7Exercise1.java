import java.util.Scanner;

public class Lesson7Exercise1 {

    public static void showMenu() {
        System.out.print("Input number between 1 and 4: ");
    }

    public static int getOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void option1() {
        System.out.println("option 1 called");
    }

    public static void option2() {
        System.out.println("option 2 called");
    }

    public static void option3() {
        System.out.println("option 3 called");
    }

    public static void main(String[] args) {
        int option;
        do {
            showMenu();
            option = getOption();

            if (option == 1) {
                option1();
            } else if (option == 2) {
                option2();
            } else if (option == 3) {
                option3();
            } else if (option == 4) {
                System.out.println("Bye!");
            } else {
                System.out.println("This isn't a valid option. Try a number between 1 and 4.");
            }
        } while (option != 4);

    }
}
