import java.util.Scanner;

// 파도반 수열
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 테스트 케이스 수 입력받기
        int T = scanner.nextInt();
        long[] results = new long[T];

        // 2. 테스트
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            results[i] = P(N);
        }

        // 3. 출력하기
        for (long result : results) {
            System.out.println(result);
        }

        scanner.close();
    }

    private static long P(int N) {
        // 1. 초기값 반환
        if (N == 1 || N == 2 || N == 3) return 1;

        // 2. 초기 설정
        long[] dp = new long[N + 1];
        for (int i = 1; i <= 3; i++) {
            dp[i] = 1;
        }

        // 3. DP 테이블 설정
        for (int i = 4; i <= N; i++) {
            dp[i] = dp[i - 3] + dp[i - 2];
        }

        return dp[N];
    }
}
