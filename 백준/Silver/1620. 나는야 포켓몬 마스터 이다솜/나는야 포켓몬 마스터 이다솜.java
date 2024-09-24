import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 나는야 포켓몬 마스터 이다솜
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> reverseMap = new HashMap<>();

        // 1. 도감에 있는 포켓몬의 개수 N과 문제의 개수 M 입력받기
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        // 2. 도감에 있는 포켓몬 입력 받기
        for (int i = 1; i <= N; i++) {
            String pokemonName = br.readLine();
            map.put(i, pokemonName);
            reverseMap.put(pokemonName, i);
        }

        // 3. 문제 입력 받기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String problem = br.readLine();

            // 입력값이 숫자인 경우 -> map
            if (Character.isDigit(problem.charAt(0))) {
                int number = Integer.parseInt(problem);
                sb.append(map.get(number)).append("\n");
            } else {
                // 문자열인 경우 -> reverseMap
                sb.append(reverseMap.get(problem)).append("\n");
            }

        }

        // 4. 결과 출력하기
        System.out.println(sb);
    }

}
