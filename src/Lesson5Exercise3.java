import java.util.HashMap;
import java.util.Scanner;

public class Lesson5Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> questions = new HashMap<>();
        int grade = 0;

        questions.put("Capital of UK? ", "London");
        questions.put("5+7 = ", "12");
        questions.put("2+2*2 = ", "6");
        questions.put("4! = ", "24");
        questions.put("What is lecture's first name ", "Ian");
        questions.put("What is lecture's last name ", "Simpson");
        questions.put("How old would you be if you were born 10 years ago? ", "10");
        questions.put("What is the name of creator of this program? ", "Oleksandr");
        questions.put("What is the highest negative integer? ", "-1");
        questions.put("Who is CEO of Tesla? ", "Elon Musk");

        for (String question : questions.keySet()) {
            System.out.print(question);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(questions.get(question))) {
                grade ++;
                System.out.print("Correct :)  ");
            } else {
                System.out.print("Incorrect :(  ");
            }

            System.out.printf("You have answered correctly %d times!%n", grade);
        }
    }
}
