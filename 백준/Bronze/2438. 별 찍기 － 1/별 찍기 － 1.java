// 2438번: 별 찍기 - 1
/*
   첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 입력 받기
        int number = scanner.nextInt();

        // 2. 별찍기
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
