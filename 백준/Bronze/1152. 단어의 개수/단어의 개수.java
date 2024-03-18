// 1152번: 단어의 개수
/*
    영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
    이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
    단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 입력 받기
        String str = scanner.nextLine();

        // 2. 계산하기
        int wordCount = countWords(str);

        // 3. 출력하기
        System.out.println(wordCount);
    }

    public static int countWords(String str) {
        // 1.앞 뒤 공백 제거 후 공백을 기준으로 분할
        String[] parts = str.trim().split("\\s+");

        // 2. 중복을 고려하여 단어 계산
        int count = 0;
        for (String word : parts) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
