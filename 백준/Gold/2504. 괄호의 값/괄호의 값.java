// package algorithm_lecture.stackApp;

import java.io.*;
import java.util.Stack;

// 응용 문제 2504: 괄호의 값
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 입력값 받기
        String input = br.readLine();

        // 2. 계산하기
        int result = calculate(input);
        bw.write((result) + "\n");

        // 3. 출력하기
        bw.flush();
    }

    private static int calculate(String input) {
        Stack<String> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(String.valueOf(c));
            } else if (c == ')' || c == ']') {
                if (!stack.isEmpty()) {
                    if (c == ')' && stack.peek().equals("(")) {
                        stack.pop();
                        stack.push("2");
                    } else if (c == ']' && stack.peek().equals("[")) {
                        stack.pop();
                        stack.push("3");
                    } else {
                        int sum = 0;
                        while (!stack.isEmpty() && !stack.peek().equals("(") && !stack.peek().equals("[")) {
                            String num = stack.pop();
                            sum += Integer.parseInt(String.valueOf(num));
                        }
                        if (!stack.isEmpty()) {
                            if (c == ')' && stack.peek().equals("(")) {
                                stack.pop();
                                int cal = Integer.parseInt(String.valueOf(sum)) * 2;
                                stack.push(String.valueOf(cal));
                            } else if (c == ']' && stack.peek().equals("[")) {
                                stack.pop();
                                int cal = Integer.parseInt(String.valueOf(sum)) * 3;
                                stack.push(String.valueOf(cal));
                            } else {
                                return 0;
                            }
                        } else {
                            return 0;
                        }
                    }
                } else {
                    return 0;
                }
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            String num = stack.pop();
            if (num.equals("(") || num.equals("[")) {
                return 0;
            }
            sum += Integer.parseInt(String.valueOf(num));
        }

        return sum;
    }

}


/*
(11)([])

11 6
 */