// package ktb.morningStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 입력 받기
        int n = Integer.parseInt(st.nextToken()); // n의 약수 중
        int k = Integer.parseInt(st.nextToken()); // k번째로 작은 수

        // 2. 약수 구하기
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        // 3. 예외 처리 후 출력하기
        if (list.size() < k) {
            System.out.println(0);
            return;
        }
        System.out.println(list.get(k - 1));
    }
}
