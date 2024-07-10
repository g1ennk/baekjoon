import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read count
        int count = sc.nextInt();
        int[] numbers = new int[count];
        
        // Read and insert into array
        for(int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Sorting
        Arrays.sort(numbers);
        
        int answer = numbers[0] * numbers[numbers.length - 1];
        if(count == 1) {
            answer = numbers[0] * numbers[0];
        }
        
        // Print
        System.out.println(answer);
    }
}