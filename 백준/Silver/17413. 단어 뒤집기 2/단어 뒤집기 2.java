import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input
        String input = sc.nextLine();
        
        // Print result
        System.out.println(flippedWord(input));
    }
    
    public static String flippedWord(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean inside = false;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        
            if(c == '<') {
                // Clear stack and append characters to StringBuilder
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                inside = true;
                sb.append(c); // append '<'
            } else if(c == '>') {
                inside = false;
                sb.append(c); // append '>'
            } else if(c == ' ') {
                // Clear stack and append characters to StringBuilder
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(c); // append space
            } else if(inside) {
                sb.append(c); // append character inside tag directly
            } else {
                stack.push(c); // push character to stack
            }
        }
        
        // Clear remaining stack and append characters to StringBuilder
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        return sb.toString();
    } 
}
