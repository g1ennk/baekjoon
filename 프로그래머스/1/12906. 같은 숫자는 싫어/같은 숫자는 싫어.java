import java.util.*;

public class Solution {
    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int number : arr) {
            if (stack.isEmpty() || number != stack.peek()) {
                stack.push(number);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}