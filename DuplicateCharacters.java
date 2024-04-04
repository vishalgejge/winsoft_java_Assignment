import java.util.HashMap;

public class DuplicateCharacters {
    public static void findDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) { 
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("To find Duplicate characters in the string:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " - " + charCountMap.get(ch) + " times");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Programming";

        findDuplicateCharacters(str);
    }
}
