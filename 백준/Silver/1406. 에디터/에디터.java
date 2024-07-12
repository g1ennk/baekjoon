import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the initial string and number of operations
        String inputStr = br.readLine();
        int count = Integer.parseInt(br.readLine());

        // Call the edit function and print the final result
        System.out.println(edit(inputStr, count, br));
    }

    public static String edit(String str, int count, BufferedReader br) throws IOException {
        // Initializing stacks
        Stack<Character> originalStack = new Stack<>();
        Stack<Character> tempStack = new Stack<>();

        // Push existing characters to originalStack
        for (int i = 0; i < str.length(); i++) {
            originalStack.push(str.charAt(i));
        }

        // Process operations
        for (int i = 0; i < count; i++) {
            String op = br.readLine();
            switch (op.charAt(0)) {
                case 'L':
                    if (!originalStack.isEmpty()) {
                        tempStack.push(originalStack.pop());
                    }
                    break;
                case 'D':
                    if (!tempStack.isEmpty()) {
                        originalStack.push(tempStack.pop());
                    }
                    break;
                case 'B':
                    if (!originalStack.isEmpty()) {
                        originalStack.pop();
                    }
                    break;
                case 'P':
                    originalStack.push(op.charAt(2));
                    break;
            }
        }

        // Append characters from originalStack to StringBuilder
        StringBuilder sb = new StringBuilder();
        while (!originalStack.isEmpty()) {
            sb.append(originalStack.pop());
        }

        // Reverse the StringBuilder to get the correct order
        sb.reverse();

        // Append characters from tempStack to StringBuilder
        while (!tempStack.isEmpty()) {
            sb.append(tempStack.pop());
        }

        return sb.toString();
    }
}
