// package algorithm_lecture.bfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 연습 문제 4179: 불!
public class Main {

    static int R, C;
    static String[][] MAZE;
    static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 미로 크기 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        MAZE = new String[R][C];

        // 2. 미로 정보 입력받기
        int initJ[] = null;
        Queue<int[]> fireQueue = new LinkedList<>();
        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                MAZE[i][j] = String.valueOf(line.charAt(j));
                if (MAZE[i][j].equals("J")) initJ = new int[]{i, j};
                else if (MAZE[i][j].equals("F")) fireQueue.add(new int[]{i, j});
            }
        }

        // 3. 탐색하기
        String result = bfs(initJ, fireQueue);

        // 4. 출력하기
        bw.write(result);
        bw.flush();
    }

    private static String bfs(int[] initJ, Queue<int[]> fireQueue) {
        // 1. 초기화
        Queue<int[]> jihunQueue = new LinkedList<>();
        int days = 0;

        // 2. 초기 방문처리
        jihunQueue.offer(initJ);
        MAZE[initJ[0]][initJ[1]] = "#";

        while (!jihunQueue.isEmpty()) {
            // 1. 불 확산
            int fireSize = fireQueue.size();
            for (int i = 0; i < fireSize; i++) {
                int[] cur = fireQueue.poll();
                for (int[] dir : DIRECTIONS) {
                    int newX = cur[0] + dir[0];
                    int newY = cur[1] + dir[1];

                    // 미로 밖 범위 처리
                    if (newX < 0 || newX >= R || newY < 0 || newY >= C) continue;

                    // 방문처리
                    if (MAZE[newX][newY].equals(".")) {
                        MAZE[newX][newY] = "F";
                        fireQueue.offer(new int[]{newX, newY});
                    }
                }
            }

            // 2. 지훈이 이동
            int jihunSize = jihunQueue.size();
            for (int i = 0; i < jihunSize; i++) {
                int[] cur = jihunQueue.poll();
                for (int[] dir : DIRECTIONS) {
                    int newX = cur[0] + dir[0];
                    int newY = cur[1] + dir[1];

                    // 범위를 나가는 경우 바로 종료
                    if (newX < 0 || newX >= R || newY < 0 || newY >= C) {
                        return String.valueOf(days + 1);
                    }

                    // 방문처리
                    if (MAZE[newX][newY].equals(".")) {
                        MAZE[newX][newY] = "#";
                        jihunQueue.offer(new int[]{newX, newY});
                    }
                }
            }

            // 이후 하루 종료
            days++;
        }

        return "IMPOSSIBLE";
    }
}
