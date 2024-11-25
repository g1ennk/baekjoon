// package algorithm_lecture.array;

import java.util.Scanner;

// 개수 세기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 정수의 개수 입력 받기
        int N = sc.nextInt();

        // 2. 정수 N개 입력 받기
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. 정수 v 입력 받기
        int v = sc.nextInt();

        // 3. 결과 출력하기
        System.out.println(getMatchCount(arr, v));
    }

    static int getMatchCount(int[] arr, int v) {
        int count = 0;
        for (int number : arr) {
            if (number == v) {
                count++;
            }
        }
        return count;
    }
}
