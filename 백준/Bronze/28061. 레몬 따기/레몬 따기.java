import java.util.Arrays;
import java.util.Scanner;

// 레몬 따기
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 나무의 수 N개 입력받기
        int N = scanner.nextInt();

        // 2. 나무에 자라 있는 레몬의 개수 입력받기
        int[] lemonTrees = new int[N];
        for (int i = 0; i < N; i++) {
            lemonTrees[i] = scanner.nextInt();
        }

        // 3. 최대 레몬의 개수 구하기
        System.out.println(calculateMaxLemons(lemonTrees));
    }

    static int calculateMaxLemons(int[] lemonTrees) {
        int maxLemons = 0;
        for (int i = 0; i < lemonTrees.length; i++) {
            maxLemons = Math.max(maxLemons - 1, lemonTrees[i] - 1);
        }
        return maxLemons;
    }
}
