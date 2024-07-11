// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the length of the string
        int strLen = scanner.nextInt();
        scanner.nextLine();
        
        // Read the string
        String str = scanner.nextLine();
        
        // Calculate and print the hash value
        System.out.println(hashing(strLen, str));
        
        // Close the scanner
        scanner.close();
    }
    
    public static int hashing(int strLen, String str) {
        int hashValue = 0;
        for(int i = 0; i < strLen; i++) {
            int x = str.charAt(i) - 96;
            int y = (int) Math.pow(31, i);
            hashValue += x * y;
        }
        
        return hashValue;
    }
}