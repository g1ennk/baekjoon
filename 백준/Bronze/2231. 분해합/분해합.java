import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the input number
        int number = scanner.nextInt();

        // 2. Find the constructor
        int constructor = findSmallestGenerator(number);

        // 3. Print the result
        System.out.println(constructor);
    }

    // 가장 작은 생성자를 찾는 함수
    public static int findSmallestGenerator(int n) {
        for (int candidate = 1; candidate < n; candidate++) {
            int sum = candidate + calculateDigitSum(candidate);
            if (sum == n) {
                return candidate;
            }
        }
        return 0; // 생성자가 없는 경우
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
