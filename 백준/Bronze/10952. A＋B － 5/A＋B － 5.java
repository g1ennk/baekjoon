import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Continuously loop to receive input until terminated
        while (true) {
            // Read two integers from the user input
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();

            // Check if both numbers are 0, if so, terminate the program
            if (firstNumber == 0 && secondNumber == 0) {
                return;
            }

            // Print the sum of the two numbers
            System.out.println(add(firstNumber, secondNumber));
        }
    }

    // Method to add two numbers and return the result
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
