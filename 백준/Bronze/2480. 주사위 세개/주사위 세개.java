// package algorithm_lecture.basic;

import java.util.Scanner;

// 주사위 세 개
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 초기화
        int prize = 0;

        // 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 계산
        if (a == b && b == c) {
            // 세 숫자가 같은 경우
            prize = 10000 + a * 1000;
        } else if (a == b || a == c) {
            // 두 숫자가 같은 경우 (a와 b 또는 a와 c가 같은 경우)
            prize = 1000 + a * 100;
        } else if (b == c) {
            // 두 숫자가 같은 경우 (b와 c가 같은 경우)
            prize = 1000 + b * 100;
        } else {
            // 세 숫자가 모두 다른 경우
            int maxNumber = Math.max(Math.max(a, b), c);
            prize = maxNumber * 100;
        }

        // 출력
        System.out.println(prize);
    }
}
