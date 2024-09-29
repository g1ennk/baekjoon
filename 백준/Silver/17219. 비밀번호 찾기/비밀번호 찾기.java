import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 비밀번호 찾기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> passwordMap = new HashMap<>();

        // 1. 저장된 사이트 주소의 수 N과 찾으려는 사이트 주소의 수 M 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfSites = Integer.parseInt(st.nextToken());
        int numberOfTargetsSites = Integer.parseInt(st.nextToken());

        // 2. 저장된 사이트의 주소의 수를 입력받아 해시맵에 추가
        for (int i = 0; i < numberOfSites; i++) {
            st = new StringTokenizer(br.readLine());
            String sites = st.nextToken();
            String password = st.nextToken();

            passwordMap.put(sites, password);
        }

        // 3. 찾으려는 사이트의 주소를 입력받아 결과 만들기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfTargetsSites; i++) {
            String targetSite = br.readLine();
            sb.append(passwordMap.get(targetSite)).append("\n");
        }

        // 4. 결과 출력하기
        System.out.println(sb);
    }
}
