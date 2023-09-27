import java.util.Scanner;

public class Lesson5Extra3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input pattern: ");
        String pattern = scanner.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.print(pattern);
        }
    }
}
