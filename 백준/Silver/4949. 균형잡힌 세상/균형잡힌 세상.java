// package algorithm_lecture.stackApp;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 입력값이 온점일 때까지 반복
        while (true) {
            // 2. 문자열 입력받기
            String input = br.readLine();

            if (input.equals(".")) {
                break;
            }

            // 3. 균형인지 아닌지 확인
            bw.write(isBalanced(input) + "\n");
        }

        // 4. 출력하기
        bw.flush();
    }

    private static String isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']') {
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return "no";
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? "yes" : "no";
    }
}
