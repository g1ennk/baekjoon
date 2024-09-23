import java.util.HashSet;
import java.util.Scanner;

// 집합
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // 1. 연산의 수 M 입력받기
        int M = sc.nextInt();
        sc.nextLine();

        // 2. 연산 읽기
        for (int i = 0; i < M; i++) {
            String[] input = sc.nextLine().split(" ");
            String command = input[0];
            int x = 0;

            if (input.length == 2) {
                x = Integer.parseInt(input[1]);
            }

            switch (command) {
                case "add":
                    set.add(x);
                    break;
                case "remove":
                    set.remove(x);
                    break;
                case "check":
                    sb.append(set.contains(x) ? "1\n" : "0\n");
                    break;
                case "toggle":
                    if (set.contains(x)) {
                        set.remove(x);
                    } else {
                        set.add(x);
                    }
                    break;
                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }

        // 3. 결과 출력하기
        System.out.println(sb);
    }

}
