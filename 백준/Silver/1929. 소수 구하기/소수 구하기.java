import java.util.*;

class Main {
    public static void main(String[] args) {
        // Read range numbers
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        // Read whole number
        for(int i = num1; i <= num2; i++) {
            if(isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrimeNumber(int number) {
        if(number <= 1) {
            return false;
        }
        
        if(number == 2) {
            return true;
        }
        
        if(number % 2 == 0) {
            return false;
        }
        
        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if(number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}