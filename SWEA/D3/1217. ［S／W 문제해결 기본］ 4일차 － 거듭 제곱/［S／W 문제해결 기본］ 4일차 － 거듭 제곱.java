// package samsung.problemSolving.basic.day4;

import java.util.Scanner;

//1217. [S/W 문제해결 기본] 4일차 - 거듭 제곱 D3
public class  Solution {
    private static final int TEST_CASE = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < TEST_CASE; i++) {
            // 1. 테스트 케이스 입력받기
            int T = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("#%d %d\n", T, pow(a, b));
        }

        sc.close();
    }

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * pow(a, b - 1);
    }
}
