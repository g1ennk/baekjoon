import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 함수
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 테스트 케이스의 수 입력 받기
        int T = Integer.parseInt(br.readLine());

        // 2. 테스트 케이스 입력받기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(fibonacci2(N)).append("\n");
        }

        // 3. 출력하기
        System.out.println(sb.toString());

    }

    private static String fibonacci2(int n) {
        int[] zeroDp = new int[n + 2];
        int[] oneDp = new int[n + 2];

        zeroDp[0] = 1;
        zeroDp[1] = 0;
        oneDp[0] = 0;
        oneDp[1] = 1;

        for (int i = 2; i <= n; i++) {
            zeroDp[i] = zeroDp[i - 1] + zeroDp[i - 2];
            oneDp[i] = oneDp[i - 1] + oneDp[i - 2];
        }

        return String.valueOf(zeroDp[n]) + " " + String.valueOf(oneDp[n]);
    }
}
