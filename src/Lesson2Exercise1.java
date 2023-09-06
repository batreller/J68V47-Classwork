import java.util.Scanner;

public class Lesson2Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.print("Input your hobby: ");
        String hobby = scanner.nextLine();
        System.out.println(name + " loves " + hobby + " in their free time");
        System.out.println(name + " finds it relaxing and satisfying to see their " + hobby + " come to life.");
        System.out.println(hobby + " allows " + name + " to express their creative side");
    }
}
