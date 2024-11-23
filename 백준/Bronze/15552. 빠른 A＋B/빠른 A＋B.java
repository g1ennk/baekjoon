// package algorithm_lecture.basic;

import java.io.*;
import java.util.StringTokenizer;

// 빠른 A + B
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 테스트 케이스 수 입력
        int t = Integer.parseInt(br.readLine());

        // 2. 테스트 케이스 수만큼 연산 후 출력
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a + b + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
