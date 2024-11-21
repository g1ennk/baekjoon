// package algorithm_lecture.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// X보다 작은 수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. N과 X 입력받기
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();

        // 2. N개의 수 입력받기
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        // 3. 결과
        List<Integer> answer = solution(array, X);

        // 4. 결과 출력하기
        for (int number : answer) {
            System.out.print(number + " ");
        }

        sc.close();
    }

    static List<Integer> solution(int[] array, int X) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < X) {
                list.add(array[i]);
            }
        }

        return list;
    }
}
