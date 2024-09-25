import java.util.*;

// 듣보잡
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        // 1. 듣도 못한 사람의 N과 보도 못한 사람의 수 M 입력받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        // 2. 듣도 못한 사람의 수와 보도 못한 사람의 수 입력받기
        for (int i = 0; i < N + M; i++) {
            String name = scanner.nextLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 3. 값이 2라면 듣도 보도 못한 사람
        int count = 0;
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() == 2) {
                list.add(stringIntegerEntry.getKey());
                count++;
            }
        }

        // 4. 알파벳 순으로 정렬하기
        Collections.sort(list);

        // 5. 출력하기
        System.out.println(count);
        for (String s : list) {
            System.out.println(s);
        }
        
        scanner.close();
    }
}
