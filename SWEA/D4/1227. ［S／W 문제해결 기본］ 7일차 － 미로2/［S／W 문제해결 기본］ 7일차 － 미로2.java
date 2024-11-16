// package samsung.problemSolving.basic.day7;

import java.util.Scanner;
import java.util.Stack;

// 1227. [S/W 문제해결 기본] 7일차 - 미로2 D4
public class Solution {

    static final int MAZE_SIZE = 100;
    static final int[][] maze = new int[MAZE_SIZE][MAZE_SIZE];
    static final int TEST_SIZE = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개의 테스트
        for (int i = 0; i < TEST_SIZE; i++) {
            // 1. 테스트 케이스 번호 입력받기
            int testNumber = sc.nextInt();
            sc.nextLine();

            // 2. 미로 입력받기
            for (int j = 0; j < MAZE_SIZE; j++) {
                String line = sc.nextLine();
                for (int k = 0; k < line.length(); k++) {
                    maze[j][k] = line.charAt(k) - '0';
                }
            }

            // 3. DFS 탐색
            int result = dfs(1, 1);

            // 4. 결과 출력하기
            System.out.printf("#%d %d\n", testNumber, result);
        }

        sc.close();
    }

    static int dfs(int startX, int startY) {
        // 스택 초기화
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startX, startY});
        maze[startY][startX] = 1; // 시작점 방문 처리

        // 상하좌우
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];

            // 도착지점 확인
            if (maze[y][x] == 3) {
                return 1;
            }

            // 상하좌우 이동
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                // 경계 조건 및 방문 여부 확인
                if (newX >= 0 && newX < MAZE_SIZE && newY >= 0 && newY < MAZE_SIZE && maze[newY][newX] != 1) {
                    // 방문 여부 확인
                    if (maze[newY][newX] == 3) {
                        return 1;
                    }
                    stack.push(new int[]{newX, newY});
                    maze[newY][newX] = 1; // 방문 처리
                }
            }
        }

        return 0; // 도착점에 도달하지 못한 경우
    }
}
