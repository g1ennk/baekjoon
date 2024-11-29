// package algorithm_lecture.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static final int MAX_SIZE = 10000;

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        // 1. 명령어의 개수 입력받기
        int N = Integer.parseInt(br.readLine());

        // 2. 명령어 입력받기
        String[] commands = new String[N];
        for (int i = 0; i < N; i++) {
            commands[i] = br.readLine();
        }

        // 3. 결과 출력
        String answer = solution2(commands);
        System.out.println(answer);
    }

    // 1. 스택 직접 구현
    static String solution1(String[] commands) {
        StackImplementation stack = new StackImplementation(MAX_SIZE);
        StringBuilder sb = new StringBuilder();

        for (String command : commands) {
            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                stack.push(value);
            } else {
                switch (command) {
                    case "pop":
                        sb.append(stack.pop()).append("\n");
                        break;
                    case "size":
                        sb.append(stack.size()).append("\n");
                        break;
                    case "empty":
                        sb.append(stack.empty()).append("\n");
                        break;
                    case "top":
                        sb.append(stack.top()).append("\n");
                        break;
                }
            }
        }

        return sb.toString();
    }

    // 2. 라이브러리로 구현
    static String solution2(String[] commands) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (String command : commands) {
            if (command.startsWith("push")) {
                stack.push(Integer.parseInt(command.split(" ")[1]));
            } else {
                switch (command) {
                    case "pop":
                        if (stack.isEmpty()) {
                            sb.append(-1).append("\n");
                            break;
                        }
                        sb.append(stack.pop()).append("\n");
                        break;
                    case "size":
                        sb.append(stack.size()).append("\n");
                        break;
                    case "empty":
                        if (stack.isEmpty()) {
                            sb.append(1).append("\n");
                            break;
                        }
                        sb.append(0).append("\n");
                        break;
                    case "top":
                        if (stack.isEmpty()) {
                            sb.append(-1).append("\n");
                            break;
                        }
                        sb.append(stack.peek()).append("\n");
                        break;
                }
            }
        }

        return sb.toString();
    }

}

class StackImplementation {
    private int[] stack;
    private int top;
    private int size;

    public StackImplementation(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = 0;
    }

    public int size() {
        return top;
    }

    public int empty() {
        return top == 0 ? 1 : 0;
    }

    public boolean isFull() {
        return top == size;
    }

    public void push(int value) {
        if (isFull()) {
            return;
        }
        stack[top++] = value;
    }

    public int pop() {
        if (empty() == 1) {
            return -1;
        }
        return stack[--top];
    }

    public int top() {
        if (empty() == 1) {
            return -1;
        }
        return stack[top - 1];
    }
}


