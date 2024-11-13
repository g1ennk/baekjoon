// package samsung;

import java.util.Arrays;
import java.util.Scanner;

// 1210. [S/W 문제해결 기본] 2일차 - Ladder1 D4
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 10번
        for (int t = 1; t <= 10; t++) {
            // 1. 사다리 입력 받으면서 도착지점 찾기
            int[][] ladder = new int[100][100];
            int endY = ladder.length - 1;
            int endX = 0; // 도착 X 좌표 (Y = Length - 1)

            sc.nextInt(); // 한 칸 넘기기
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    ladder[i][j] = sc.nextInt();
                    if (ladder[i][j] == 2) {
                        endX = j;
                    }
                }
            }

            // 2. 출발 지점까지 역추적
            int startX = getStartIndex(ladder, endX, endY);

            // 3. 결과 출력
            System.out.printf("#%d %d\n", t, startX);


        }

        sc.close();
    }

    public static int getStartIndex(int[][] ladder, int endX, int endY) {
        while (endY > 0) {
            // 왼쪽 이동
            if (endX > 0 && ladder[endY][endX - 1] == 1) {
                while (endX > 0 && ladder[endY][endX - 1] == 1) {
                    endX--;
                }
            }
            // 오른쪽 이동
            else if (endX < ladder.length - 1 && ladder[endY][endX + 1] == 1) {
                while (endX < ladder.length - 1 && ladder[endY][endX + 1] == 1) {
                    endX++;
                }
            }

            // 위로 이동 (가장 후순위)
            endY--;
        }
        return endX;
    }


}
