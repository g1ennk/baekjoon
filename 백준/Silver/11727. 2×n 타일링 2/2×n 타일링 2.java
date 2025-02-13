import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. n 입력받기
        int n = sc.nextInt();

        // 2. dp로 계산 및 출력하기
        System.out.println(dp(n));

        sc.close();
    }

    private static int dp(int n) {
        // 조기 반환
        if (n == 1) return 1;
        if (n == 2) return 3;

        // 테이블 초기화
        int[] dp = new int[n + 1];

        // 초기값 채우기
        dp[1] = 1;
        dp[2] = 3;

        // 나머지 채우기
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007;
        }

        return dp[n];
    }
}
