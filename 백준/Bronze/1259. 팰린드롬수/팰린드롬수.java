import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an empty string to hold the result
        String result = "";

        // Keep taking input until '0' is entered
        while (true) {
            String input = scanner.nextLine();

            // If the first character of input is not '0'
            if (input.charAt(0) != '0') {
                // Check if the input is a palindrome and store the result
                result = isPalindrome(input);
                
                // Print the result
                System.out.println(result);
            } else {
                // If '0' is entered, exit the loop
                break;
            }
        }
    }

    private static String isPalindrome(String input) {
        // Initialize front and back pointers
        int front = 0;
        int back = input.length() - 1;
        
        // Initialize the result as "yes"
        String result = "yes";

        // Iterate through the string until the middle is reached
        for (int i = 0; i < input.length() / 2; i++) {
            // If characters at front and back are not equal
            if (input.charAt(front) != input.charAt(back)) {
                // Set result to "no" and exit the loop
                result = "no";
                break;
            } else {
                // Move front pointer forward and back pointer backward
                front++;
                back--;
            }
        }
        // Return the result
        return result;
    }
}
