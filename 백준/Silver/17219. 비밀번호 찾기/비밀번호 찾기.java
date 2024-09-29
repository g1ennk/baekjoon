import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 비밀번호 찾기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<>();

        // 1. 저장된 사이트 주소의 수 N과 찾으려는 사이트 주소의 수 M 입력받기
        String[] input1 = br.readLine().split(" ");
        int numberOfSites = Integer.parseInt(input1[0]);
        int numberOfTargetsSites = Integer.parseInt(input1[1]);

        // 2. 저장된 사이트의 주소의 수를 입력받아 해시맵에 추가
        for (int i = 0; i < numberOfSites; i++) {
            String[] input = br.readLine().split(" ");
            String sites = input[0];
            String password = input[1];

            map.put(sites, password);
        }

        // 3. 찾으려는 사이트의 주소를 입력받아 비밀번호 찾기
        String[] answers = new String[numberOfTargetsSites];
        for (int i = 0; i < numberOfTargetsSites; i++) {
            String targetSite = br.readLine();
            answers[i] = map.get(targetSite);
        }

        // 4. 비밀번호 출력하기
        for (String answer : answers) {
            System.out.println(answer);
        }
    }
}
