// package algorithm_lecture.array;

import java.util.Scanner;

// 숫자의 개수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 세 개의 자연수 입력받기
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= sc.nextInt();
        }

        // 2. 출력하기
        System.out.println(getResult(result));
    }

    static String getResult(int result) {
        int[] arr = new int[10];

        while (result != 0) {
            int target = result % 10;
            arr[target]++; // 빈도 수 증가
            result /= 10;
        }

        StringBuilder answer = new StringBuilder();
        for (int num : arr) {
            answer.append(num).append("\n");
        }

        return answer.toString();
    }
}
