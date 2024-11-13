// package samsung;

import java.util.Scanner;

// 1210. [S/W 문제해결 기본] 2일차 - Ladder1 D4
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 10번
        for (int t = 1; t <= 10; t++) {
            
            // 1. 사다리 입력 받기
            int[][] ladder = new int[100][100];
            sc.nextInt(); // 한 칸 넘기기
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    ladder[i][j] = sc.nextInt();
                }
            }

            // 2. 최단 거리 구하기
            int shortestDistance = getShortestDistance(ladder);

            // 3. 결과 출력
            System.out.printf("#%d %d\n", t, shortestDistance);
        }

        sc.close();
    }

    public static int getShortestDistance(int[][] ladder) {
        int shortestDistance = Integer.MAX_VALUE;
        int shortestDistanceIndex = -1;

        for (int i = 0; i < ladder.length; i++) {
            if (ladder[0][i] == 1) {
                if (getDistance(ladder, i) < shortestDistance) {
                    shortestDistance = getDistance(ladder, i);
                    shortestDistanceIndex = i;
                }
            }
        }
        return shortestDistanceIndex;
    }

    private static int getDistance(int[][] ladder, int startX) {
        int count = 0;
        int startY = 0;
        while (startY < ladder.length) {
            // 왼쪽 이동
            if (startX > 0 && ladder[startY][startX - 1] == 1 ) {
                while (startX > 0 && ladder[startY][startX - 1] == 1) {
                    startX--;
                    count++;
                }
            }
            // 오른쪽 이동
            else if (startX < ladder.length - 1 && ladder[startY][startX + 1] == 1 ) {
                while (startX < ladder.length - 1 && ladder[startY][startX + 1] == 1) {
                    startX++;
                    count++;
                }
            }
            // 밑으로 이동
            startY++;
            count++;
        }

        return count;
    }
}
