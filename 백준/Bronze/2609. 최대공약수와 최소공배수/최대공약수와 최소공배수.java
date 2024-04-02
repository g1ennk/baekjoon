import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two numbers from user input
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        // Find GCD
        int GCD = calculateGCD(firstNumber, secondNumber);
        System.out.println(GCD);

        // Find LCM
        int LCM = calculateLCM(firstNumber, secondNumber, GCD);
        System.out.println(LCM);
    }

    private static int calculateGCD(int firstNumber, int secondNumber) {
        // Ensure first number is greater than second number
        if (firstNumber < secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        // Use Euclidean algorithm to find GCD
        while (true) {
            int restNumber = firstNumber % secondNumber;
            if (restNumber == 0) {
                break;
            }
            firstNumber = secondNumber;
            secondNumber = restNumber;
        }
        return secondNumber;
    }

    private static int calculateLCM(int firstNumber, int secondNumber, int GCD) {
        // Calculate LCM using the formula: LCM = (a * b) / GCD(a, b)
        return (firstNumber * secondNumber) / GCD;
    }
}
