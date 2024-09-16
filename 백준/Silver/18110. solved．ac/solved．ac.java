import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

// solved.ac
public class Main {
    // 절사평균의 반
    private static final double HALF_TM = 0.15;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 문제 의견의 개수 n 입력 받기
        int n = Integer.parseInt(br.readLine());
        // 예외처리
        if (n == 0) {
            System.out.println("0");
            return;
        }

        // 2. n을 바탕으로 난이도 의견 입력 받기
        int[] levels = new int[n];
        for (int i = 0; i < n; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }

        // 3. 난이도 계산하기
        int resultLevel = calculateLevel(levels);

        // 4. 출력하기
        System.out.println(resultLevel);
    }

    static int calculateLevel(int[] levels) {
        // 1. 배열 오름차순 정렬
        Arrays.sort(levels);

        // 2. 제외되는 사람 계산하기
        int exception = (int) Math.round(levels.length * HALF_TM);

        // 3. 제외된 사람을 가지고 루프 돌며 전체 더하기
        int total = 0;
        int totalCount = 0;
        for (int i = exception; i < levels.length - exception; i++) {
            total += levels[i];
            totalCount++;
        }

        // 4. 평균 계산하기
        double average = (double) total / totalCount;

        return (int) Math.round(average);
    }

}
/*
- 아무 의견이 없다면 난이도 0 -> input이 0이면 난이도 0
- 아래에서 15%, 위에서 15%
- 사람 제외: 위아래로 반올림
- 평균: 정수 반올림
 */