// package algorithm_lecture.bfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 연습 문제 1926: 그림
public class Main {

    static int[][] BOARD;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 세로 크기 n과 m 입력받기
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 2. 2차원 배열 초기화
        BOARD = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                BOARD[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 3. 탐색 시작
        int total = 0;
        int maxSize = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (BOARD[i][j] == 1 && !visited[i][j]) {
                    total++;
                    int size = bfs(i, j);
                    maxSize = Math.max(maxSize, size);
                }
            }
        }

        // 4. 결과 출력
        bw.write(total + "\n");
        bw.write(maxSize + "\n");
        bw.flush();

    }

    static int bfs(int startX, int startY) {
        // 1. 초기화
        Queue<int[]> queue = new LinkedList<>();
        visited[startX][startY] = true;
        queue.offer(new int[]{startX, startY});

        int size = 1; // 현재 그림의 크기

        while (!queue.isEmpty()) {
            // 2. 큐 뽑기
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            // 3. 상하좌우 탐색
            for (int k = 0; k < 4; k++) {
                int nx = curX + dx[k];
                int ny = curY + dy[k];

                // 4. 범위 체크
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (visited[nx][ny] || BOARD[nx][ny] != 1) continue;

                // 5. 방문 처리 푸시
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny});
                size++;
            }
        }

        return size;
    }
}