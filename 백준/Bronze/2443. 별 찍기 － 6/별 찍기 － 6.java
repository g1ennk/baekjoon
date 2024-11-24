// package algorithm_lecture.basic;

import java.util.Scanner;

// 별 찍기 - 6
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 입력 받기
        int lines = sc.nextInt();

        // 2. 별 찍기
        printStar(lines);
    }

    static void printStar(int lines) {
        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = lines * 2 - 1; j > i * 2; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
