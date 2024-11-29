// package algorithm_lecture.stack;

import java.util.Scanner;
import java.util.Stack;

// 제로
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        // 1. 명렁어 개수 입력
        int K = sc.nextInt();

        // 2. 명령어 수행
        for (int i = 0; i < K; i++) {
            int number = sc.nextInt();
            if (number == 0) {
                stack.pop();
                continue;
            }
            stack.push(number);
        }

        // 3. 결과 합산
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        // 4. 결과 출력
        System.out.println(sum);
    }
}
