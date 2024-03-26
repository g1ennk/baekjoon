import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize all alphabet into -1
        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetMap.put(c, -1);
        }

        // Read input string
        String inputString = scanner.nextLine();

        // Update position
        updateMap(alphabetMap, inputString);

        // Print alphabetMap after updating positions
        printMap(alphabetMap);

    }

    private static void updateMap(HashMap<Character, Integer> alphabetMap, String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            int position = alphabetMap.get(currentChar);

            if (position == -1) {
                alphabetMap.put(currentChar, i);
            }
        }
    }

    private static void printMap(HashMap<Character, Integer> alphabetMap) {
        for (char key : alphabetMap.keySet()) {
            int position = alphabetMap.get(key);
            System.out.print(position + " ");
        }
    }

}
