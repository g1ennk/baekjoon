// package algorithm_lecture.array;

import java.util.Scanner;

// 연습 문제: 알파벳 개수
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 입력 받기
        String input = sc.nextLine();

        // 2. 결과 출력
        System.out.println(getAlphabetFreq(input));
    }

    static String getAlphabetFreq(String str) {
        int[] freq = new int[26]; // 빈도 배열

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a'; // 알파벳의 위치 ex) a = 0, b = 1
            freq[index]++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i : freq) {
            answer.append(i).append(" ");
        }

        return answer.toString();
    }
    
}
