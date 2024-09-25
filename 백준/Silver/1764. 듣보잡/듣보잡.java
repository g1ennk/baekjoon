import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 듣보잡
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 듣도 못한 사람의 N과 보도 못한 사람의 수 M 입력받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2. 듣도 못한 사람 입력받기
        HashSet<String> unheard = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unheard.add(br.readLine());
        }

        // 듣도 보도 못한 사람 찾기 (교집합 찾기)
        List<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String unseen = br.readLine();
            if (unheard.contains(unseen)) {
                list.add(unseen);
            }
        }

        // 4. 알파벳 순으로 정렬하기
        Collections.sort(list);

        // 5. 출력하기
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
