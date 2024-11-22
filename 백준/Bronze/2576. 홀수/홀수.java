// package algorithm_lecture.basic;

import java.util.Scanner;

// 홀수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 초기화
        StringBuilder answer = new StringBuilder();
        int oddMin = Integer.MAX_VALUE;
        int oddSum = 0;
        
        // 계산
        for (int i = 0; i < 7; i++) {
            int number = sc.nextInt();

            if (number % 2 != 0) {
                oddSum += number;
                if (number < oddMin) {
                    oddMin = number;
                }
            }
        }
        
        // 판별
        if (oddSum != 0) {
            answer.append(oddSum).append("\n").append(oddMin);
        } else {
            answer.append(-1);
        }
        
        // 출력
        System.out.println(answer);
    }
}
