import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the total count of numbers and the input number
        int count = scanner.nextInt();

        // 2. Call the method to print added numbers
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(add(a,b));
        }

        scanner.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
