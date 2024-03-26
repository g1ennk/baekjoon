import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read input string
        String inputString = scanner.nextLine();

        // 2. Initialize the alphabet array with -1
        int[] alphabetArray = initializeAlphabetArray();

        // 3. Store the first appearance index of each character in the input string
        storeFirstAppearance(inputString, alphabetArray);

        // 4. Print the alphabet array
        printAlphabetArray(alphabetArray);
    }

    public static int[] initializeAlphabetArray() {
        int[] alphabetArray = new int[26];
        Arrays.fill(alphabetArray, -1);
        return alphabetArray;
    }

    public static void storeFirstAppearance(String inputString, int[] alphabetArray) {
        for (int i = 0; i < inputString.length(); i++) {
            int charIndex = inputString.charAt(i) - 'a';
            if (alphabetArray[charIndex] == -1) {
                alphabetArray[charIndex] = i;
            }
        }
    }

    public static void printAlphabetArray(int[] alphabetArray) {
        for (int index : alphabetArray) {
            System.out.print(index + " ");
        }
    }
}