import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    // 상수 선언을 통해 매직 넘버 제거
    private static final int CORRECT = 1;

    public static int solution(int[] answers) {
        int extraPoints = 0;
        int totalScore = 0;

        for (int answer : answers) {
            if (answer == CORRECT) {
                totalScore += 1 + extraPoints;
                extraPoints++;
            } else {
                extraPoints = 0;
            }
        }

        return totalScore;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 문제 수 입력 받기
        int numberOfProblems = scanner.nextInt();
        int[] problemsResult = new int[numberOfProblems];

        // 2. 정답 여부 입력 받기
        for (int i = 0; i < numberOfProblems; i++) {
            problemsResult[i] = scanner.nextInt();
        }

        // 3. 계산결과 출력
        System.out.println(solution(problemsResult));
    }
}