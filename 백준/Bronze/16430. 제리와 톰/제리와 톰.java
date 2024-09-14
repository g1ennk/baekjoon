import java.util.Scanner;

public class Main {

    public static void solution(int a, int b) {
        // 남은 치즈의 비율 계산 후 출력
        int remainingCheese = b - a;
        System.out.printf("%d %d%n", remainingCheese, b);
    }

    public static void main(String[] args) {
        // 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 두 정수를 입력받음
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 결과 출력
        solution(a, b);
    }
}
