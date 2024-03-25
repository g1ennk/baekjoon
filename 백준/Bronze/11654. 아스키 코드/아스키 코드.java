import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read a line of input from the user
        String input = scanner.nextLine();
        char character = input.charAt(0);

        // Call the convertToAscii method to convert the first character of the input to ASCII
        System.out.println(getAsciiValue(character));
    }

    // Method to convert a character to its ASCII value
    public static int getAsciiValue(char character) {
        // Convert the character to its ASCII value and return
        return (int) character;
    }
}
