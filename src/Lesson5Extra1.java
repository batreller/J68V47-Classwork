import java.math.BigInteger;
import java.util.Scanner;

public class Lesson5Extra1 {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(number + "! = " + factorial);
    }
}
