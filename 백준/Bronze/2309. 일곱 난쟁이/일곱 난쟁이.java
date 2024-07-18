import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] array = new int[9];
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            int number = Integer.parseInt(br.readLine());
            array[i] = number;
            sum += number;
        }
        
        int targetSum = sum - 100;
        boolean found = false;
        for(int i = 0; i < 9 && !found; i++) {
            for(int j = i + 1; j < 9; j++) {
                int num1 = array[i];
                int num2 = array[j];
                
                if(num1 + num2 == targetSum) {
                    array[i] = 0;
                    array[j] = 0;
                    found = true;
                    break;
                }
            }
        }
        
        Arrays.sort(array);
        
        for(int i = 2; i < 9; i++) {
            System.out.println(array[i]);
        }
        
    }
}