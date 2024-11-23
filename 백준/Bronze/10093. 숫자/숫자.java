// package algorithm_lecture.basic;

import java.util.Arrays;
import java.util.Scanner;

// 숫자
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] input = new long[2];
        input[0] = sc.nextLong();
        input[1] = sc.nextLong();

        Arrays.sort(input);

        long start = input[0];
        long end = input[1];

        StringBuilder answer = new StringBuilder();

        if (start == end) {
            System.out.println(0);
            return;
        }

        answer.append(end - start - 1).append("\n");
        for (long i = start + 1; i < end; i++) {
            answer.append(i).append(" ");
        }

        System.out.println(answer);
    }
}
