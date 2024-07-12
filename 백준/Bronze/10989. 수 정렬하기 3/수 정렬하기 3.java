// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int count = Integer.parseInt(br.readLine());
        
        int[] array = new int[count];
        for(int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(array);
        
        for (int n : array) {
            sb.append(n).append("\n");
        }
        
        System.out.println(sb);
    }
}