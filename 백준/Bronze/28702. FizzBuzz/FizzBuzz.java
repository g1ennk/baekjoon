import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Get next number
        int current = 0;
        for(int i = 0; i < 3; i++) {
            String str = br.readLine();
            if(isInteger(str)) {
                current = Integer.parseInt(str);
            }
            current++;
        }
        
        // Print the result
        System.out.println(translate(current));
    }
    
    public static String translate(int current) {
        if(current % 15 == 0) {
            return "FizzBuzz";
        } else if(current % 3 == 0 && current % 5 != 0) {
            return "Fizz";
        } else if (current % 3 != 0 && current % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(current);
        }
    }
    
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}
