import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String inputString = scanner.nextLine();

        // Read the index of the character to be printed
        int charIndex = scanner.nextInt();

        // Print the result
        char resultChar = getCharAtIndex(inputString, charIndex);
        System.out.println(resultChar);
    }

    // Method to return the character at the given index in the given string
    public static char getCharAtIndex(String inputString, int index) {
        return inputString.charAt(index - 1);
    }
}
