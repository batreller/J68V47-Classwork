import java.util.Scanner;

public class Lesson5Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a base number: ");
        int baseNumber = scanner.nextInt();

        for (int i = 1; i < 13; i++) {
            System.out.printf("%d x %d = %d%n", baseNumber, i, baseNumber*i);
        }
    }
}
