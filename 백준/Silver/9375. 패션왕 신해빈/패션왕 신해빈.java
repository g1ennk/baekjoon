import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 테스트 케이스 입력 받기
        int T = Integer.parseInt(br.readLine());
        int[] answers = new int[T];

        // 2. 각 테스트 케이스마다 의상의 개수 입력 받기
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            String[] clothes = new String[N];
            for (int j = 0; j < N; j++) {
                clothes[j] = br.readLine();
            }
            answers[i] = calculateMaxDays(clothes);
        }

        // 3. 출력하가
        for (int answer : answers) {
            System.out.println(answer);
        }

        br.close();
    }

    private static int calculateMaxDays(String[] input) {
        HashMap<String, Integer> map = new HashMap<>();
        int combination = 1;

        for (String s : input) {
            String type = s.split(" ")[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        for (Integer value : map.values()) {
            combination *= (value + 1); // 옷을 입지 않는 경우도 있기 때문에 1을 더함
        }

        return combination - 1; // 아무것도 입지 않는 경우의 수가 있기 때문에 1을 빼줌
    }
}
