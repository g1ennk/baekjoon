// package algorithm_lecture.bfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 연습 문제 2178: 미로 탐색
public class Main {

    static int N;
    static int M;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 미로의 크기 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 2. 초기화
        maze = new int[N][M];
        visited = new boolean[N][M];

        // 2. 미로 입력받기
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = s.charAt(j) - '0'; // 문자 -> 정수 변환
            }
        }

        // 3. 탐색하기
        int minDistance = bfs(0, 0);

        // 4. 출력하기
        bw.write(minDistance + "\n");
        bw.flush();
    }

    private static int bfs(int startX, int startY) {
        // 1. 초기화
        Queue<int[]> queue = new LinkedList<>();
        visited[startX][startY] = true;
        queue.add(new int[]{startX, startY});
        maze[startX][startY] = 1; // 칸을 셀 때 시작 위치와 도착 위치도 포함하기 때문에

        while (!queue.isEmpty()) {
            // 2. 큐 뽑기
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];
            int curDist = maze[curX][curY];

            // 3. 상하좌우 탐색
            for (int dir = 0; dir < 4; dir++) {
                int newX = curX + dx[dir];
                int newY = curY + dy[dir];
                int newDist = curDist + 1;

                // 4. 범위 체크
                if (newX < 0 || newX >= N || newY < 0 || newY >= M) continue;
                if (visited[newX][newY] || maze[newX][newY] == 0) continue;

                // 5. 방문 처리 후 푸시
                visited[newX][newY] = true;
                queue.add(new int[]{newX, newY});
                maze[newX][newY] = newDist;

                // 6. 목표 지점 도달 시 거리 반환
                if (newX == N - 1 && newY == M - 1) {
                    return newDist;
                }
            }
        }

        return -1;
    }
}
