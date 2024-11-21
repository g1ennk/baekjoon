// package algorithm_lecture.basic;

import java.util.Scanner;

// 시험 성적
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 시험 성적 입력 받기
        int grade = sc.nextInt();

        // 2. 성적 출력하기
        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
