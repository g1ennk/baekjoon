// package algorithm_lecture.basic;

import java.util.Scanner;

// 별 찍기 - 5
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

            for (int j = lines - 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
