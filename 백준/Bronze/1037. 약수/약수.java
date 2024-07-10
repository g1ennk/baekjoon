import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of true divisors
        int count = sc.nextInt();
        int[] divisors = new int[count];
        
        // Read the true divisors
        for(int i = 0; i < count; i++) {
            divisors[i] = sc.nextInt();
        }
        
        // Sort the array of divisors
        Arrays.sort(divisors);
        
        // The original number N is the product of the smallest and largest divisor
        int N = divisors[0] * divisors[divisors.length - 1];
        
        // Print the result
        System.out.println(N);
        
        // Close the scanner
        sc.close();
    }
}