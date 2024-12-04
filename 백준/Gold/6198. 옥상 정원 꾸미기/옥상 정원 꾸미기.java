// package algorithm_lecture.stack;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 빌딩의 개수 N 입력받기
        int N = Integer.parseInt(br.readLine());

        // 3. 각 관리인들이 벤치마킹이 가능한 빌딩의 수 구하기
        Stack<Long> stack = new Stack<>();
        long count = 0;
        for (int i = 0; i < N; i++) {
            long height = Long.parseLong(br.readLine());

            while (!stack.isEmpty() && stack.peek() <= height) {
               stack.pop();
            }

            count += stack.size();

            stack.push(height);
        }

        // 4. 출력하기
        System.out.println(count);

        br.close();

    }
}
