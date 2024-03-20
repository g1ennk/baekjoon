import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 입력받음과 동시에 나머지 저장하기
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int n = scanner.nextInt();
            arr[i] = n % 42;
        }

        // 2. 서로 다른 수 계산하기
        System.out.println(countDifferentNumbers(arr));
    }
    // HashSet으로 서로 다른 수 계산하기
    public static int countDifferentNumbers(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}
