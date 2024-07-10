import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        
        String[] answers = new String[count];
        for (int i = 0; i < count; i++) {
            String bracket = br.readLine();
            answers[i] = isVPS(bracket);
        }
        
        for(String yesOrNo : answers) {
            System.out.println(yesOrNo);
        }
        
    }
    
    public static String isVPS(String bracket) {
        Stack <Character> stack = new Stack<>();
        for(int i = 0; i < bracket.length(); i++) {
            char c = bracket.charAt(i);
            if(!stack.isEmpty()) {
                if(stack.peek() == '(' && c == ')') {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        
        return (stack.isEmpty()) ? "YES" : "NO";
    }
}