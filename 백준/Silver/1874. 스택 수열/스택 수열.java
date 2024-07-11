// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of elements
        int elementCount = scanner.nextInt();
        int[] sequence = new int[elementCount];
        
        // Read the elements into the array
        for(int i = 0; i < elementCount; i++) {
            sequence[i] = scanner.nextInt();
        }
        
        // Print the result
        System.out.println(isValidStackSequence(sequence));
    }
    
    public static String isValidStackSequence(int[] sequence) {
        Stack <Integer> stack = new Stack<>();
        StringBuilder op = new StringBuilder();
        int currentNum = 1;
        
        for(int i = 0; i < sequence.length; i++) {
            int targetNum = sequence[i];
            
            while(targetNum >= currentNum) {
                stack.push(currentNum++);
                op.append("+\n");
            }
            
            int top = stack.peek();
            if(top == targetNum) {
                stack.pop();
                op.append("-\n");
            }
        }

        return stack.isEmpty() ? op.toString() : "NO";
    }
}