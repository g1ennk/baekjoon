import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the count of numbers to receive
        int count = scanner.nextInt();

        // 2. Receive the numbers and find the maximum and minimum numbers
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        // 3. Print the result
        System.out.println(min + " " + max);

        scanner.close();
    }
}
