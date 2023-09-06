import java.util.Scanner;

public class Lesson2Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int a = scanner.nextInt();
        System.out.print("What is the second number? ");
        int b = scanner.nextInt();

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "*" + b + "=" + (a*b));
        System.out.println(a + "/" + b + "=" + ((float) a / (float) b));
        System.out.println(a + "%" + b + "=" + (a % b));
        System.out.println(a + "^" + b + "=" + (a ^ b));
    }
}
