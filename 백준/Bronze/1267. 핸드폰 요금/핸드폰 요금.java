// package algorithm_lecture.basic;

import java.util.Scanner;

// 핸드폰 요금
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();

        // 1. 통화 개수 입력 받기
        int callCount = sc.nextInt();

        // 2. 통화시간 입력 후 요금제 각각 계산
        int Y = 0;
        int M = 0;
        for (int i = 0; i < callCount; i++) {
            int call = sc.nextInt();

            // Y 요금제
            if (call < 30) {
                Y += 10;
            } else {
                Y += (call / 30 + 1) * 10;
            }

            // M 요금제
            if (call < 60) {
                M += 15;
            } else {
                M += (call / 60 + 1) * 15;
            }
        }

        // 3. 결과 집계
        if (Y < M) {
            answer.append("Y ").append(Y);
        } else if (M < Y) {
            answer.append("M ").append(M);
        } else {
            answer.append("Y ").append("M ").append(Y);
        }
        
        // 4. 결과 출력
        System.out.println(answer);
    }
}
