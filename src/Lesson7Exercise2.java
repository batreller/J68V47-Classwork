import java.util.Scanner;

public class Lesson7Exercise2 {
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.printf("The sum of %d and %d is %d", num1, num2, calculateSum(num1, num2));
    }
}
