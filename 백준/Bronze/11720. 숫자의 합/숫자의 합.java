// 11720: N개의 숫자가 공백 N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. N개의 숫자 받기
        int n = scanner.nextInt();

        // 2. 숫자 받기
        String number = scanner.next();

        // 4. 변환한 문자열을 char 단위로 배열에 넣기
        char[] arr = number.toCharArray();

        // 5. 해당 배열을 처음부터 끝까지 돌면서 하나씩 합에 저장하기
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] - '0';
        }
        // 6. 출력하기
        System.out.println(sum);
    }
}
