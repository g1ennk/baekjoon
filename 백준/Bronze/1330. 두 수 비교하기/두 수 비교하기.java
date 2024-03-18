// 1330번: 두 수 비교하기
/*
   두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 입력 받기
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        // 2. 비교하고 출력하기
        System.out.println(compareNumbers(firstNumber, secondNumber));

    }

    public static String compareNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return ">";
        } else if (firstNumber < secondNumber) {
            return "<";
        } else {
            return "==";
        }
    }
}
