import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 3개의 숫자 받으면서 곱하기
        int result = multiplyNumbers(scanner);

        // 2. 문자열로 변환
        String str = convertToString(result);

        // 3. 숫자 등장 횟수 계산
        int[] counts = countOccurrences(str);

        // 4. 출력하기
        printCounts(counts);
    }
    
    // 숫자 곱하기
    public static int multiplyNumbers(Scanner scanner) {
        int result = 1;
        final int NUM_COUNT = 3;
        for (int i = 0; i < NUM_COUNT; i++) {
            result *= scanner.nextInt();
        }
        return result;
    }

    // 문자열 변환
    public static String convertToString(int result) {
        return Integer.toString(result);
    }

    // 숫자 등장 횟수 계산
    public static int[] countOccurrences(String str) {
        int[] counts = new int[10];
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            counts[digit]++;
        }
        return counts;
    }

    // 등장 횟수 출력하기
    public static void printCounts(int[] counts) {
        for (int n : counts) {
            System.out.println(n);
        }
    }
}
