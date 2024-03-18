import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstFiveDigits = new int[5];

        // 입력 받기
        for (int i = 0; i < 5; i++) {
            firstFiveDigits[i] = scanner.nextInt();
        }

        int verificationNumber = calculateVerificationNumber(firstFiveDigits);

        // 결과 출력
        System.out.println(verificationNumber);
    }

    // 검증수 계산
    public static int calculateVerificationNumber(int[] firstFiveDigits) {
        int sumOfSquaredDigits = 0;

        // 각 자리 숫자를 제곱
        for (int i = 0; i < 5; i++) {
            sumOfSquaredDigits += firstFiveDigits[i] * firstFiveDigits[i];
        }

        // 10으로 나눈 나머지 검증수 반환
        return sumOfSquaredDigits % 10;
    }
}
