// package algorithm_lecture.bfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 연습 문제 7576: 토마토
public class Main {

    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 상자의 크기 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cols = Integer.parseInt(st.nextToken());
        int rows = Integer.parseInt(st.nextToken());
        int[][] boxes = new int[rows][cols];

        // 2. 토마토 정보 입력받기
        Queue<int[]> queue = new LinkedList<>();
        int unriped = 0;

        for (int i = 0; i < rows; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < cols; j++) {
                boxes[i][j] = Integer.parseInt(st.nextToken());
                if (boxes[i][j] == 1) {
                    queue.add(new int[]{i, j}); // 익은 토마토의 위치 저장
                } else if (boxes[i][j] == 0) {
                    unriped++; // 아직 익지 않은 토마토 개수 세기
                }
            }
        }

        // 3. 모든 토마토가 익어 있는 상태인 경우
        if (unriped == 0) {
            bw.write(unriped + "\n");
            bw.flush();
            return;
        }

        // 3. BFS 탐색하기
        int days = calculateRipeningDays(queue, boxes, unriped);

        // 4. 출력하기
        bw.write(days + "\n");
        bw.flush();
    }

    private static int calculateRipeningDays(Queue<int[]> queue, int[][] boxes, int unriped) {
        int days = -1;

        // 1. 초기화
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // 현재 레벨의 크기

            // 2. 하루치 탐색
            for (int i = 0; i < levelSize; i++) {
                int[] cur = queue.poll();
                int curX = cur[0];
                int curY = cur[1];

                // 3. 상하좌우 탐색
                for (int[] direction : DIRECTIONS) {
                    int newX = curX + direction[0];
                    int newY = curY + direction[1];

                    // 4. 범위 및 조건 체크: 범위를 벗어나지 않고 익지 않은 토마토인 경우에만 익음 처리
                    if (isValidPosition(newX, newY, boxes) && boxes[newX][newY] == 0) {
                        boxes[newX][newY] = 1;
                        unriped--;
                        queue.add(new int[]{newX, newY});
                    }
                }
            }

            // 한 레벨의 종료는 하루의 끝을 의미
            days++;
        }

        // 모두 익은 경우 days 반환, 아닌 경우 -1 반환
        return (unriped == 0) ? days : -1;
    }

    // 범위 체크
    private static boolean isValidPosition(int x, int y, int[][] boxes) {
        int rows = boxes.length;
        int cols = boxes[0].length;
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
}