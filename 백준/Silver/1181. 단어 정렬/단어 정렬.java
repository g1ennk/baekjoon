import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of words
        int wordCount = scanner.nextInt();
        scanner.nextLine();

        // Initialize HashSet to remove duplicates
        HashSet<String> wordSet = new HashSet<>();

        // Input the words
        for (int i = 0; i < wordCount; i++) {
            String word = scanner.nextLine();
            wordSet.add(word);
        }

        // Convert HashSet to an array and sort the words by length and then alphabetically
        String[] uniqueWords = wordSet.toArray(new String[0]);
        sortWords(uniqueWords);

        // Print the sorted unique words
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    // Method to sort words by length and then alphabetically
    private static void sortWords(String[] words) {
        Arrays.sort(words, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
    }
}
