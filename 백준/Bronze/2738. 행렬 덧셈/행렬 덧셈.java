// package ktb.morningStudy._250421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 행렬의 크기 입력 받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2. A의 원소 M개 입력 받기
        int[][] a = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 3. B의 원소 M개 입력 받기
        int[][] b = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 4. 계산 후 출력하기
        System.out.println(solution(a,b));
    }

    static String solution(int[][] a, int[][] b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sb.append(a[i][j] + b[i][j]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
