// package samsung.problemSolving.basic.day3;

import java.util.Scanner;

// 1213. [S/W 문제해결 기본] 3일차 - String D3
public class Solution {

    private static final int TEST_COUNT = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] answers = new int[TEST_COUNT];
        for (int i = 0; i < TEST_COUNT; i++) {
            sc.nextLine(); // 한 칸 스킵
            String pattern = sc.nextLine();
            String text = sc.nextLine();
            answers[i] = getMatchCount(pattern, text);
        }

        for (int i = 0; i < TEST_COUNT; i++) {
            System.out.printf("#%d: %d%n", i + 1, answers[i]);
        }

        sc.close();
    }

    public static int getMatchCount(String pattern, String text) {
        int matchCount = 0;
        int patternLen = pattern.length();

        for (int i = 0; i < text.length() - patternLen + 1; i++) {
            String target = text.substring(i, i + patternLen);
            if (target.equals(pattern)) {
                matchCount++;
            }
        }

        return matchCount;
    }

}
