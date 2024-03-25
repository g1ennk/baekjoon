import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Keep reading input until there is no more input
        while (scanner.hasNext()) {
            // Read two integers from the input
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();

            // Calculate the sum of the two numbers using the add method and print the result
            System.out.println(add(firstNumber, secondNumber));
        }

        // Close the scanner to release resources
        scanner.close();
    }

    // Method to add two integers and return the result
    public static int add(int a, int b) {
        return a + b;
    }
}
