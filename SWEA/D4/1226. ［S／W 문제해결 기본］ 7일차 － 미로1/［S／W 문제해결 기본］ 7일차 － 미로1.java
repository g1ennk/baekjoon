// package samsung.problemSolving.basic.day7;

import java.util.*;

// 1226. [S/W 문제해결 기본] 7일차 - 미로1 D4
public class Solution {

    static final int MAZE_SIZE = 16;
    static final int[][] maze = new int[MAZE_SIZE][MAZE_SIZE];
    static final int TEST_SIZE = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개의 테스트
        for (int t = 0; t < TEST_SIZE; t++) {
            // 1. 테스트 케이스 번호 입력받기
            int testNumber = sc.nextInt();
            sc.nextLine();

            // 2. 미로 입력받기
            for (int i = 0; i < MAZE_SIZE; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < line.length(); j++) {
                    maze[i][j] = line.charAt(j) - '0';
                }
            }

            // 3. BFS 탐색
            int result = bfs(1, 1);

            // 4. 결과 출력하기
            System.out.printf("#%d %d\n", testNumber, result);
        }

        sc.close();
    }

    static int bfs(int startX, int startY) {
        // 큐 초기화
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startX, startY});
        maze[startY][startX] = 1; // 시작점 방문 처리

        // 상하좌우
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];

            // 도착 지점 확인
            if (maze[y][x] == 3) {
                return 1;
            }

            // 상하좌우 이동
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                // 경계 조건 및 방문 여부 확인
                if (newX >= 0 && newX < MAZE_SIZE && newY >= 0 && newY < MAZE_SIZE && maze[newY][newX] != 1) {
                    if (maze[newY][newX] == 3) {
                        return 1;
                    }
                    q.add(new int[]{newX, newY});
                    maze[newY][newX] = 1;
                }
            }
        }

        return 0; // 도착지점에 도달하지 못함
    }
}
