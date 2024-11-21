// package algorithm_lecture.basic;

import java.util.Arrays;
import java.util.Scanner;

// 세수정렬
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 세 수 입력 받기
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // 2. 정렬하기
        Arrays.sort(numbers);

        // 3. 출력하기
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
