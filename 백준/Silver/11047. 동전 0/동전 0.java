import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 1. 동전 종류 N과 목표 금액 입력받기
        int N = Integer.parseInt(st.nextToken());
        int totalValue = Integer.parseInt(st.nextToken());

        // 2. N개의 동전 종류 입력받기
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        // 3. 필요없는 동전 지우기
        int lastIndex = list.size() - 1;
        while (totalValue < list.get(lastIndex)) {
            list.remove(lastIndex--);
        }

        // 4. 최소 동전의 개수 구하기
        int minCoins = getMinimumCoins(totalValue, list);

        // 4. 결과 출력
        System.out.println(minCoins);
    }

    static int getMinimumCoins(int totalValue, List<Integer> list) {
        int minCoins = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            int coin = list.get(i);
            if (totalValue < coin) {
                continue;
            }

            int coinCount = totalValue / coin;
            minCoins += coinCount;
            totalValue = totalValue - (coin * coinCount);
        }

        return minCoins;
    }
}
