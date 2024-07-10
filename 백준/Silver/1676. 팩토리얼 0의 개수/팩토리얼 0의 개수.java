import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Main {
    public static void main(String[] args) throws IOException {
        // Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        
        // Calculate factorial
        BigInteger factorialResult = factorial(input);
        
        // Count zero
        int zeroCount = countZero(factorialResult);
        
        // Print
        System.out.println(zeroCount);
    }
    
    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for(int i = num; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        return result;
    }
    
    public static int countZero(BigInteger factorial) {
        String factorialStr = factorial.toString();
        int count = 0;
        for(int i = factorialStr.length() - 1; i >= 0; i--) {
            char c = factorialStr.charAt(i);
            if(c != '0') {
                break;
            } else {
                count++;
            }
        }
        
        return count;
    }
}