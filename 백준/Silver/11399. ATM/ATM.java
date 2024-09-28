import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// ATM
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 1. 사람의 수 입력받기
        int N = sc.nextInt();

        // 2. 인출 시간 입력 받기
        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            times[i] = sc.nextInt();
        }

        // 3. 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟갑 구하기
        int minWithdrawTime = getMinWithdrawTime(times);

        // 4. 출력하기
        System.out.println(minWithdrawTime);
    }

    private static int getMinWithdrawTime(int [] times) {
        int totalTime = 0;
        int cumulativeSum = 0;

        // 1. 오름차순으로 정렬
        Arrays.sort(times);

        // 2. 누적합 계산
        for (int time : times) {
            cumulativeSum += time;
            totalTime += cumulativeSum;
        }

        return totalTime;
    }
}
