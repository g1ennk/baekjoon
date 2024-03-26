import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user input
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        // Print the sum of the two numbers
        System.out.println(multiply(firstNumber, secondNumber));

    }

    // Method to multiply two numbers and return the result
    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
