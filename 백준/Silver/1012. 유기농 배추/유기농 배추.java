// package algorithm_lecture.bfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 기본 문제 1012: 유기농 배추
public class Main {

    static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 테스트 케이스 수 입력 받기
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            // 2. 가로 M, 세로 N, 배추가 심어져 있는 위치의 개수 K 입력 받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] field = new int[M][N];

            // 3. 배추의 위치 입력 받기
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }

            // 4. 탐색하기
            int count = 0;
            for (int k = 0; k < M; k++) {
                for (int l = 0; l < N; l++) {
                    if (field[k][l] == 1) {
                        bfs(field, k, l);
                        count++;
                    }
                }
            }

            bw.write(count + "\n");
        }

        // 5. 결과 출력하기
        bw.flush();
    }

    private static void bfs(int[][] field, int k, int l) {
        Queue<int[]> queue = new LinkedList<>();

        // 초기화
        queue.add(new int[]{k, l});
        field[k][l] = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            // 상하좌우 탐색
            for (int[] dir : DIRECTIONS) {
                int newX = cur[0] + dir[0];
                int newY = cur[1] + dir[1];

                // 범위 체크
                if (newX < 0 || newX >= field.length || newY < 0 || newY >= field[0].length || field[newX][newY] != 1)
                    continue;

                // 방문 처리
                field[newX][newY] = 0;
                queue.add(new int[]{newX, newY});
            }
        }
    }
}