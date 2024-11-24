// package algorithm_lecture.basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 초기화
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        
        // 최댓값과 해당 인덱스 찾기
        for (int i = 0; i < 9; i++) {
            int number = sc.nextInt();

            if (number > max) {
                max = number;
                maxIndex = i + 1;
            }
        }
        
        // 출력
        StringBuilder answer = new StringBuilder();
        answer.append(max).append("\n").append(maxIndex);
        System.out.println(answer);
    }
}
