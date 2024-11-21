// package algorithm_lecture.basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 두 자연수 입력 받기
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 2. +, -, *, /, % 연산 차례대로 출력하기
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }
}
