// package algorithm_lecture.array;

import java.util.Arrays;
import java.util.Scanner;

// 방 배정
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 총 학생 수와 방 인원 입력 받기
        int N = sc.nextInt(); // 총 학생 수
        int K = sc.nextInt(); // 방에 들어갈 수 있는 인원

        // 2. 초기화
        int[][] gradesAndGender = new int[7][2]; // 1학년 ~ 6학년

        // 3. 학생 정보 입력 받기
        for (int i = 0; i < N; i++) {
            int gender = sc.nextInt();
            int grade = sc.nextInt();
            gradesAndGender[grade][gender]++;
        }

        // 4. 결과 출력하기
        System.out.println(calculateNeededRoom(gradesAndGender, K));

    }

    static int calculateNeededRoom(int[][] gradesAndGender, int K) {
        int count = 0;

        for (int i = 1; i < gradesAndGender.length; i++) {
            if (gradesAndGender[i][0] > 0 || gradesAndGender[i][1] > 0) {
                count += (gradesAndGender[i][0] + K - 1) / K; // 여학생
                count += (gradesAndGender[i][1] + K - 1) / K; // 남학생
            }
        }

        return count;
    }
}
