
import java.util.Scanner;

// Pups
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 입력 개수 입력 받기
        int n = scanner.nextInt();

        // 2. 각각의 d,f,p 입력 받기
        double totalAmount = 0;
        for (int i = 0; i < n; i++) {
            double d = scanner.nextDouble(); // number of dogs
            double f = scanner.nextDouble(); // amount of food
            double p = scanner.nextDouble(); // price per pound

            // 3. 계산하기
            totalAmount = calculateTotalAmount(d, f, p);

            // 4. 출력하기
            System.out.printf("$%.2f%n", totalAmount);
        }
        
        scanner.close();
    }

    static double calculateTotalAmount(double d, double f, double p) {
        return d * f * p;
    }
}
