// package algorithm_lecture.stackApp;

import java.io.*;
import java.util.Stack;

// 기본 문제 3986: 좋은 단어
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 단어의 수 N 입력받기
        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // 2. 단어 입력 받기
            String word = br.readLine();

            // 3. 좋은 단어 판단하기
            if (isGoodWord(word)) count++;
        }

        // 4. 출력하기
        bw.write(count + "\n");
        bw.flush();
    }

    private static boolean isGoodWord(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
                continue;
            }
            stack.push(c);
        }

        return stack.isEmpty();
    }

}

/*
ABAB
AB
ABA
 */