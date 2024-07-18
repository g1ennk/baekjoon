import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read member count
        int count = Integer.parseInt(br.readLine());
        
        // Read and put member's name and age 
        Map <Integer, List<String>> map = new TreeMap<>();
        for(int i = 0; i < count; i++) {
            String[] info = br.readLine().split(" ");
            int age = Integer.parseInt(info[0]);
            String name = info[1];
            
            map.putIfAbsent(age, new ArrayList<String>());
            map.get(age).add(name);
        }
        
        // Print the result
        for(Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            int age = entry.getKey();
            List<String> names = entry.getValue();
            
            for(String name : names) {
                System.out.println(age + " " + name);
            }
        }
    }
}