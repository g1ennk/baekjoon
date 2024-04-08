import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read n, k
        int setSize = scanner.nextInt();
        int subsetSize = scanner.nextInt();

        // 2. Calculate binomial coefficient
        int result = calculateBinomialCoefficient(setSize, subsetSize);

        // 3. Print the result
        System.out.println(result);
    }

    private static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    private static int calculateBinomialCoefficient(int setSize, int subsetSize) {
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);
        return numerator / denominator;
    }
}
