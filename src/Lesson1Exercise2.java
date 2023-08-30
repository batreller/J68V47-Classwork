import java.util.HashMap;
import java.util.Map;


public class Lesson1Exercise2 {
    public static void main(String[] args) {
        HashMap<String, String> anagrams = new HashMap<>();

        anagrams.put("FUN PIE ROB", "ibuprofen");
        anagrams.put("A MOON SCAR", "macaroons");
        anagrams.put("CANVAS ICE", "vacancies");
        anagrams.put("EAT FABRIC", "fabricate");
        anagrams.put("ADDS HUNCH", "dachshund");

        for (Map.Entry<String, String> entry : anagrams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
