import java.util.Scanner;

// 1, 2, 3 더하기
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 테스트 케이스의 수 입력받기
        int T = scanner.nextInt(); // 테스트 케이스 수
        int[] results = new int[T];

        // 2. 각 테스트 케이스에 대한 결과 계산
        for (int i = 0; i < T; i++) {
            int number = scanner.nextInt();
            results[i] = calculate(number);
        }

        // 3. 출력하기
        for (int result : results) {
            System.out.println(result);
        }

        scanner.close();
    }

    private static int calculate(int n) {
        // n이 3보다 작은 경우 초기화
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        int[] dp = new int[n + 1];

        // 초기값 설정
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        // DP 계산
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }
}
