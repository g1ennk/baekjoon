import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the input number
        int inputNumber = scanner.nextInt();

        // 2. Find the smallest generator
        int smallestGenerator = findSmallestGenerator(inputNumber);

        // 3. Print the result
        System.out.println(smallestGenerator);
    }

    public static int findSmallestGenerator(int n) {
        for (int candidate = 1; candidate < n; candidate++) {
            int sum = candidate + calculateDigitSum(candidate);
            if (sum == n) {
                return candidate;
            }
        }
        return 0; // Returns 0 if no generator is found
    }

    private static int calculateDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
