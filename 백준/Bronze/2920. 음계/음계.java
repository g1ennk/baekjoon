import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 입력받기
        int[] numbers = new int[8];
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 2. 판별하기
        String result = checkOrder(numbers);

        // 3. 출력하기
        System.out.println(result);

    }
    public static String checkOrder(int[] numbers) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < numbers.length; i++) {
            // 오름차순 체크
            if (numbers[i - 1] > numbers[i]) {
                ascending = false;
            }
            // 내림차순 체크
            else if (numbers[i - 1] < numbers[i]) {
                descending = false;
            }
            // 둘 다 아닌 경우
            if (!ascending && !descending) {
                return "mixed";
            }
        }

        if (ascending) {
            return "ascending";
        } else {
            return "descending";
        }
    }
}
