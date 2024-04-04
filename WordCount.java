import java.util.HashMap;

public class WordCount {
    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Split the string into words
        String[] words = str.split("\\s+");

        // Count the occurrences of each word
        for (String word : words) {
            // Remove punctuation marks
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Update word count in the HashMap
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String str = "Java is a programming language. Java is widely used for developing applications.";

        HashMap<String, Integer> wordCountMap = countWords(str);

        System.out.println("Word counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
