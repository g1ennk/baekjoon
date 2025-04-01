// package ktb.morningStudy;

// 이진수
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 테스트 케이스 개수 입력 받기
        int t = Integer.parseInt(br.readLine());

        // 2. 테스트 시행
        for (int i = 0; i < t; i++) {
            // 숫자 입력 받기
            int n = Integer.parseInt(br.readLine());

            // 이진 수 1의 위치 찾기
            System.out.println(solution(n));
        }

    }

    static String solution(int n) {
        StringBuilder sb = new StringBuilder();

        int count = 0; // 1의 위치

        while(n > 0) {
            if (n % 2 == 1) {
                sb.append(count + " ");
            }
            n /= 2;
            count++;
        }

        return sb.toString();
    }

}
