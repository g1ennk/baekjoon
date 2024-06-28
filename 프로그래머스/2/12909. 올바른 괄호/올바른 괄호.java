import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        
        for (char c : charArray) {
            if (c == '(') {
                stack.push(c);
            } else if(c ==')') {
                // 스택이 비어 있으면 유효하지 않은 괄호 문자열
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        // 모든 괄호가 짝을 이루는지 확인
        return stack.isEmpty();
    }
}
