import java.util.HashMap;
import java.util.Scanner;

public class Lesson2Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input name of item 1: ");
        String item1Name = scanner.nextLine();
        System.out.print("Input price of item 1: ");
        Float item1Price = Float.parseFloat(scanner.nextLine());
        System.out.print("Input name of item 2: ");
        String item2Name = scanner.nextLine();
        System.out.print("Input price of item 2: ");
        Float item2Price = Float.parseFloat(scanner.nextLine());
        System.out.print("Input name of item 3: ");
        String item3Name = scanner.nextLine();
        System.out.print("Input price of item 3: ");
        Float item3Price = Float.parseFloat(scanner.nextLine());

        int itemNameWidth = 30;
        System.out.println("NESMART");
        System.out.format("%-" + itemNameWidth + "s £%.2f%n", item1Name, item1Price);
        System.out.format("%-" + itemNameWidth + "s £%.2f%n", item2Name, item2Price);
        System.out.format("%-" + itemNameWidth + "s £%.2f%n", item3Name, item3Price);
        System.out.format("SUBTOTAL                       £%.2f", (item1Price + item2Price + item3Price));
    }
}
