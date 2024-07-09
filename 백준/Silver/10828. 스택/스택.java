import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commandCount = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < commandCount; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                stack.push(value);
            } else if (command.equals("pop")) {
                if (stack.empty()) {
                    answer.append(-1).append("\n");
                } else {
                    answer.append(stack.pop()).append("\n");
                }
            } else if (command.equals("size")) {
                answer.append(stack.size()).append("\n");
            } else if (command.equals("empty")) {
                if (stack.empty()) {
                    answer.append(1).append("\n");
                } else {
                    answer.append(0).append("\n");
                }
            } else if (command.equals("top")) {
                if (stack.empty()) {
                    answer.append(-1).append("\n");
                } else {
                    answer.append(stack.peek()).append("\n");
                }
            }
        }

        System.out.print(answer);
    }
}
