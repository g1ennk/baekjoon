
import java.util.Scanner;

// 1008번: A/B
// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
public class Main {
    public static void main(String[] args) {
        // 1. 스캐너 호출
        Scanner scanner = new Scanner(System.in);

        // 2. 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // 3. 계산하기
        double quotient = calculateQuotient(A,B);

        // 4. 출력하기
        System.out.println(quotient);

        // 5. 스캐너 닫기
        scanner.close();
    }
    public static double calculateQuotient(int a, int b) {
        return (double) a / b;
    }
}
