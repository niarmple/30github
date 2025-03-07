import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static char firstUniqueChar(String s) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return '\0'; // Return null character if no unique character is found
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = firstUniqueChar(input);
        if (result != '\0') {
            System.out.println("The first unique character is: " + result);
        } else {
            System.out.println("No unique character found.");
        }
    }
}
