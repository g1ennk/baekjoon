import java.util.Scanner;

// 계단 오르기
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 계단의 개수 입력받기
        int N = scanner.nextInt();

        // 2. 계단의 점수 입력받기
        int[] stairs = new int[N];
        for (int i = 0; i < N; i++) {
            stairs[i] = scanner.nextInt();
        }

        // 3. 최댓값 계산하기
        int maxScore = calculateMaxScore(stairs);

        // 4. 출력하기
        System.out.println(calculateMaxScore(stairs));

        scanner.close();
    }

    private static int calculateMaxScore(int[] stairs) {
        // 예외 처리
        if (stairs.length == 1) return stairs[0];
        if (stairs.length == 2) return stairs[0] + stairs[1];
        if (stairs.length == 3) return Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

        // dp 테이블 초기화
        int[] dp = new int[stairs.length];

        // 초기값 설정
        dp[0] = stairs[0];
        dp[1] = stairs[0] + stairs[1];
        dp[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

        // dp 테이블 채우기
        for (int i = 3; i < stairs.length; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
        }

        return dp[stairs.length - 1];
    }
}
