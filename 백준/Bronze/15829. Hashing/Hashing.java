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
        final int OFFSET = 96;
        final int BASE = 31;
        final int MOD = 1234567891;
        
        int hashValue = 0;
        long powerOfBase = 1;

        for(int i = 0; i < strLen; i++) {
            int charValue = str.charAt(i) - OFFSET;
            hashValue = (int) ((hashValue + charValue * powerOfBase) % MOD);
            powerOfBase = (powerOfBase * BASE) % MOD;
        }
        
        return hashValue;
    }
}

