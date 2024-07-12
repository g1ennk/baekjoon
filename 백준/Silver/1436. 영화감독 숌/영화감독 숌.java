import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the nth number containing "666"
        int number = scanner.nextInt();
        
        // Print the result
        System.out.println(getTitleNumber(number));
    }
    
    public static int getTitleNumber(int n) {
        int count = 0;
        int number = 666;
        
        // Loop until the nth "666" number is found
        while(count < n) {
            // Check if the current number contains "666"
            if(String.valueOf(number).contains("666")) {
                count++;
            }
            
            // Increment the number if the desired count is not reached
            if(count < n) {
                number++;
            }
        }
        
        return number;
    }
}
