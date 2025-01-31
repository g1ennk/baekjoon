// package algorithm_lecture.bfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

// 기본 문제 10026: 적록색약
public class Main {

    static int N;
    static int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 구역 크기 입력 받기
        N = Integer.parseInt(br.readLine());
        char[][] normalGrid = new char[N][N];
        boolean[][] normalVisited = new boolean[N][N];
        char[][] blindGrid = new char[N][N];
        boolean[][] blindVisited = new boolean[N][N];

        // 2. 구역 입력받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                char color = line.charAt(j);
                normalGrid[i][j] = color;
                blindGrid[i][j] = (color == 'R' || color == 'G') ? 'E' : color; // 적록색약인 경우 빨강과 초록을 같은 색 취급
            }
        }

        // 3. 탐색하기
        int normalCount = 0;
        int blindCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!normalVisited[i][j]) {
                    bfs(normalGrid, normalVisited, i, j);
                    normalCount++;
                }
                if (!blindVisited[i][j]) {
                    bfs(blindGrid, blindVisited, i, j);
                    blindCount++;
                }
            }
        }

        // 4. 결과 출력하기
        bw.write(normalCount + " " + blindCount);
        bw.flush();
    }

    static void bfs(char[][] grid, boolean[][] visited, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();

        // 1. 시작 지점 초기화
        queue.add(new int[]{startX, startY});
        visited[startX][startX] = true;

        // 2. 탐색
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            char color = grid[x][y];

            // 3. 상하좌우 탐색
            for (int[] direction : DIRECTIONS) {
                int newX = x + direction[0];
                int newY = y + direction[1];

                // 4. 범위 밖 처리
                if (newX < 0 || newX >= N || newY < 0 || newY >= N || visited[newX][newY]) continue;

                // 5. 기존 색과 같은 경우에만 방문 처리
                char newColor = grid[newX][newY];
                if (color == newColor) {
                    visited[newX][newY] = true;
                    queue.add(new int[]{newX, newY});
                }
            }
        }
    }
}