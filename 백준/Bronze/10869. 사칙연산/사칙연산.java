import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 2. Print the result
        add(a,b);
        subtract(a,b);
        multiply(a,b);
        divide(a,b);
        modulus(a,b);

        scanner.close();
    }
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void modulus(int a, int b) {
        System.out.println(a % b);
    }
}
