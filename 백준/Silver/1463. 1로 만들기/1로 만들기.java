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
        
        dp[1] = 0;
        
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            
            if(i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            
            if(i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[n];
    }
}
