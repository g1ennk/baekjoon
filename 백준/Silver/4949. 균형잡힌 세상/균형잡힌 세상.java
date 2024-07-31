import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 여는 괄호와 닫는 괄호 매핑
        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put(']', '[');

        while (true) {
            // 종료조건: '.'이 나오면 종료
            String input = br.readLine();
            if (input.equals(".")) {
                break;
            }

            // 초기화
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                // 여는 괄호가 나오면 스택에 푸시
                if (bracketsMap.containsValue(c)) {
                    stack.push(c);
                }
                // 각각의 닫는 괄호가 나왔을 때
                else if (bracketsMap.containsKey(c)) {
                    if (stack.isEmpty() || stack.peek() != bracketsMap.get(c)) {
                        isBalanced = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!stack.empty()) {
                isBalanced = false;
            }

            System.out.println(isBalanced ? "yes" : "no");
        }
    }
}
