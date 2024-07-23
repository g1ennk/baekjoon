import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. Read first number list count
        int N = Integer.parseInt(br.readLine());
        
        // 2. Read first number list
        Set<Integer> set = new HashSet<>();
        String[] firstNumberList = br.readLine().split(" ");
        for(int i = 0 ; i < N; i++) {
            set.add(Integer.parseInt(firstNumberList[i]));
        }
        
        // 3. Read second number list count
        int M = Integer.parseInt(br.readLine());
        
        // 4. Read second number list and check existence
        StringBuilder sb = new StringBuilder();
        String[] secondNumberList = br.readLine().split(" ");
        for(int i = 0; i < M; i++) {
            int number = Integer.parseInt(secondNumberList[i]);
            if(set.contains(number)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        
        // 5. Print the result
        System.out.println(sb.toString());
    }
}