// package samsung.problemSolving.basic.day3;

import java.util.Scanner;

// 1215. [S/W 문제해결 기본] 3일차 - 회문1 D3
public class Solution {

    private static final int BOARD_LENGTH = 8;
    private static final int TEST_CASE = 10; // 10개의 테스트 케이스

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int t = 1; t <= TEST_CASE; t++) {
            // 1. 회문의 길이 입력받기
            int palindromeLength = sc.nextInt();
            sc.nextLine();

            // 2. 배열 입력받기
            char[][] board = new char[BOARD_LENGTH][BOARD_LENGTH];
            for (int i = 0; i < BOARD_LENGTH; i++) {
                board[i] = sc.nextLine().toCharArray();
            }

            // 3. 총 회문의 개수 구하기
            int totalPalindrome = countPalindrome(board, palindromeLength);

            // 4. 결과 출력하기
            System.out.printf("#%d %d\n", t, totalPalindrome);
        }

        sc.close();
    }

    public static int countPalindrome(char[][] board, int palindromeLength) {
        int count = 0;

        // 가로 탐색
        for (int i = 0; i < BOARD_LENGTH; i++) {
            for (int start = 0; start <= BOARD_LENGTH - palindromeLength; start++) {
                StringBuilder slice = new StringBuilder();
                for (int k = 0; k < palindromeLength; k++) {
                    slice.append(board[i][start + k]);
                }
                if (isPalindrome(slice.toString())) {
                    count++;
                }
            }
        }

        // 세로 탐색
        for (int j = 0; j < BOARD_LENGTH; j++) {
            for (int start = 0; start <= BOARD_LENGTH - palindromeLength; start++) {
                StringBuilder slice = new StringBuilder();
                for (int k = 0; k < palindromeLength; k++) {
                    slice.append(board[start + k][j]);
                }
                if (isPalindrome(slice.toString())) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            char current = str.charAt(i);
            char reverse = str.charAt(str.length() - i - 1);
            if (current != reverse) return false;
        }

        return true;
    }
}
