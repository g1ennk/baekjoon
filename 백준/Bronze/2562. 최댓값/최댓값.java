import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNum = Integer.MIN_VALUE;
        int maxIndex = -1;

        // 입력 받음과 동시에 최댓값과 해당 인덱스 찾기
        for (int i = 0; i < 9; i++) {
            int num = scanner.nextInt();
            if (num > maxNum) {
                maxNum = num;
                maxIndex = i + 1;
            }
        }
        System.out.println(maxNum + "\n" + maxIndex);
    }
}
