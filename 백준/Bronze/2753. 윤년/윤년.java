// package algorithm_lecture.basic;

import java.util.Scanner;

// 윤년
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 연도 입력받기
        int year = sc.nextInt();

        // 2. 윤년인지 아닌지 판단하기
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}
