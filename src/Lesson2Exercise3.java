import java.util.HashMap;
import java.util.Scanner;

public class Lesson2Exercise3 {
    public static void main(String[] args) {
        HashMap<String, Float> products = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Input name of item " + (i+1) + ": ");
            String itemName = scanner.nextLine();
            System.out.print("Input price of " + itemName + ": ");
            Float itemPrice = Float.parseFloat(scanner.nextLine());


            products.put(itemName, itemPrice);
        }

        System.out.println("NESMART");
        float sum = 0;
        for (HashMap.Entry<String, Float> entry : products.entrySet()) {
            String productName = entry.getKey();
            Float productPrice = entry.getValue();
            System.out.println(productName + ".........." + "£" + productPrice);
            sum += productPrice;
        }
        System.out.println("SUBTOTAL...." + "£" + sum);
    }
}
