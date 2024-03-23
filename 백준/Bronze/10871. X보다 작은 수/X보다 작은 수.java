import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the total count of numbers and the input number
        int count = scanner.nextInt();
        int input = scanner.nextInt();

        // 2. Create an array to store the numbers
        int[] numbers = new int[count];

        // 3. Get the numbers from the input
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 4. Call the method to print numbers less than the input
        printNumbersLessThanInput(numbers, input);

        scanner.close();
    }

    // Method to print numbers less than the input number
    public static void printNumbersLessThanInput(int[] numbers, int input) {
        for (int n : numbers) {
            if (n < input) {
                System.out.print(n + " ");
            }
        }
    }
}
