import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. n 입력받기
        int n = sc.nextInt();

        // 2. 직사각형 채우는 방법의 수 구하고, 10007로 나눈 나머지 출력
        System.out.println(dp(n));

        sc.close();
    }

    private static int dp(int n) {
        // 조기 반환
        if (n == 1) return 1;
        if (n == 2) return 2;

        // dp 테이블 생성 및 초기값 설정
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        // dp 테이블 채우기
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        return dp[n];
    }

}
