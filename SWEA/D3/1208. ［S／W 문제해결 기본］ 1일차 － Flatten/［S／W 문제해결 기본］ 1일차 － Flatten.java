// package samsung;

import java.util.*;

// [S/W 문제해결 기본] 1일차 - Flatten
public class  Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = 10;
        for (int i = 1; i <= T; i++) {
            // 1. 입력 받기
            int dumpCount = sc.nextInt();
            int[] boxes = new int[100];
            for (int j = 0; j < 100; j++) {
                boxes[j] = sc.nextInt();
            }

            // 2. 계산하기
            int difference = getDifference(boxes, dumpCount);

            // 3. 출력하기
            System.out.printf("#%d, %d\n", i, difference);
        }

        sc.close();
    }

    public static int getDifference(int[] boxes, int dumpCount) {
        // 덤프화
        for (int i = 0; i < dumpCount; i++) {
            int maxIndex = findMaxIndex(boxes);
            int minIndex = findMinIndex(boxes);

            boxes[maxIndex]--;
            boxes[minIndex]++;

            if ( boxes[maxIndex] - boxes[minIndex] <= 1) {
                break;
            }
        }
        
        // 덤프 후 차이
        int max = Arrays.stream(boxes).max().getAsInt();
        int min = Arrays.stream(boxes).min().getAsInt();

        return max - min;
    }

    private static int findMaxIndex(int[] boxes) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] > max) {
                max = boxes[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    private static int findMinIndex(int[] boxes) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] < min) {
                min = boxes[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
