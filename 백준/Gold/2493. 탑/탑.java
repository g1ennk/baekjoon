// package algorithm_lecture.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 탑
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 탑의 개수 N개 입력받기
        int N = Integer.parseInt(br.readLine());

        // 2. 각 탑의 높이를 순서대로 입력받아 처리
        String[] input = br.readLine().split(" ");
        Stack<int[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int height = Integer.parseInt(input[i - 1]);

            // 스택 최상단의 높이가 현재 탑보다 낮으면 제거
            while (!stack.isEmpty() && stack.peek()[1] < height) {
                stack.pop();
            }

            // 3. 신호를 수신할 수 있는 탑의 인덱스 확인
            if (stack.isEmpty()) {
                sb.append("0 "); // 없다면 0
            } else {
                sb.append(stack.peek()[0]).append(" "); // 스택의 최상단 탑이 신호 가능
            }

            // 4. 현재 탑을 스택에 추가
            stack.push(new int[]{i, height});
        }

        // 5. 출력하기
        System.out.println(sb);

        br.close();
    }
}
