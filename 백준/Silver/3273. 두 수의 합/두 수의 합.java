// package algorithm_lecture.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 두 수의 합
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 수열의 크기 입력 받기
        int n = sc.nextInt();

        // 2. 모든 수열 입력 받기 (동시에 최댓값 구하기)
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        // 3. 자연수 x 입력 받기
        int x = sc.nextInt();

        // 4. 결과 출력하기
        System.out.println(getCountMatches(list, x));

    }

    static int getCountMatches(List<Integer> list, int x) {
        int[] freq = new int[x + 1]; // 1부터 시작 && 최댓값까지만 배열 생성
        int matchCount = 0;

        for (int number : list) {
            if (number >= x) {
                continue;
            }
            if (freq[x - number] == 1) {
                matchCount++;
            }
            freq[number] = 1; // 방문처리
        }

        return matchCount;
    }
}
