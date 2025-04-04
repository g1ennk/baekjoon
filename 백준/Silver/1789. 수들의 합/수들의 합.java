import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 자연수 S값 입력받기
        long s = Long.parseLong(br.readLine());
        
        // 2. 계산하기
        long n = 0;
        long sum = 0;
        
        while(true) {
            n++;
            sum += n;
            
            if (sum > s) {
                n--;
                break;
            }
        }
        
        // 3. 출력하기
        System.out.println(n);
    }
}