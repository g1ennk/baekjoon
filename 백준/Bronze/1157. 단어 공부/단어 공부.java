import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read input String
        String inputString = scanner.nextLine();

        // 2. Make it to uppercase
        inputString = inputString.toUpperCase();

        // 3. Initialize for character count array
        int[] charCountArray = createCharacterCountArray(inputString);
        String uniqueCharacters = removeDuplicates(inputString);

        // 4. Create HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < uniqueCharacters.length(); i++) {
            charCountMap.put(uniqueCharacters.charAt(i), charCountArray[i]);
        }

        // 5. Find maximum frequency
        int maxFrequency = 0;
        String result = "";

        for (int i = 0; i < uniqueCharacters.length(); i++) {
            int frequency = charCountMap.get(uniqueCharacters.charAt(i));
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                result = String.valueOf(uniqueCharacters.charAt(i));
            }
            else if (frequency == maxFrequency) {
                result = "?";
            }
        }

        // 6. Print the result
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (set.add(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public static int[] createCharacterCountArray(String inputString) {
        // Remove duplicate characters from the input string
        String uniqueCharacters = removeDuplicates(inputString);

        // Initialize an array to store character counts
        int[] charCountArray = new int[uniqueCharacters.length()];
        for (int i = 0; i < uniqueCharacters.length(); i++) {
            int count = 0;
            for (int j = 0; j < inputString.length(); j++) {
                if (uniqueCharacters.charAt(i) == inputString.charAt(j)) {
                    count++;
                }
            }
            charCountArray[i] = count;
        }
        return charCountArray;
    }
}