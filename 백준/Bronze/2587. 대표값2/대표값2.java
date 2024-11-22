// package algorithm_lecture.basic;

import java.util.Arrays;
import java.util.Scanner;

// 대표값2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 초기화
        int[] numbers = new int[5];
        int sum = 0;

        // 2. 입력
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        // 3. 정렬
        Arrays.sort(numbers);

        // 4. 평균과 중앙값 계산
        int average = sum / 5;
        int median = numbers[2];

        // 5. 출력하기
        System.out.println(average);
        System.out.println(median);
    }
}

