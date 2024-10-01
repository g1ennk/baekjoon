import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1로 만들기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 정수 N 입력받기
        int N = Integer.parseInt(br.readLine());

        // 2. 최소 연산 횟수 구하기
        int minCalculation = getMinCalculation(N);

        // 3. 출력하기
        System.out.println(minCalculation);
    }

    private static int getMinCalculation(int n) {

        int[] dp = new int[n + 1];

        dp[1] = 0; // 1은 연산할 필요가 없기 때문에 0으로 초기화

        for (int i = 2; i <= n; i++) {
            // 1을 빼는 경우
            dp[i] = dp[i - 1] + 1;

            // 2로 나누어 떨어지는 경우
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3으로 떨어지는 경우
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[n];
    }
}
/*
 * 문제 접근 방식 (N = 10 예시)
 *
 * 1. 최적 부분 문제
 *    - 10을 1로 만드는 문제는 N - 1, N / 2, N / 3과 같은 작은 문제로 나눌 수 있다.
 *
 * 2. 중복되는 부분 문제
 *    - dp[10]을 구하려면 dp[9], dp[5], dp[3] 등의 값이 필요하다.
 */

