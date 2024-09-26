import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 1. 동전 종류 N과 목표 금액 입력받기
        int N = Integer.parseInt(st.nextToken());
        int totalValue = Integer.parseInt(st.nextToken());

        // 2. N개의 동전 종류 입력받기
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        // 3. 최소 동전의 개수 구하기
        int minCoins = getMinimumCoins(totalValue, coins);

        // 4. 결과 출력
        System.out.println(minCoins);
    }

    static int getMinimumCoins(int totalValue, int[] coins) {
        int minCoins = 0;

        // 내림차순으로 탐색
        for (int i = coins.length - 1; i >= 0; i--) {
            int coin = coins[i];

            if (totalValue >= coin) {
                int coinCount = totalValue / coin;
                minCoins += coinCount;
                totalValue -= (coin * coinCount);
                ;
            }
        }

        return minCoins;
    }
}
