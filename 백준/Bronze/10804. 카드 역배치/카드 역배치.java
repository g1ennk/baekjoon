// package algorithm_lecture.basic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 카드 초기화
        int[] cards = new int[20];
        for (int i = 0; i < 20; i++) {
            cards[i] = i + 1;
        }

        // 2. 10번 뒤집기
        for (int i = 0; i < 10; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            swap(cards, start, end);
        }

        // 3. 결과 출력
        StringBuilder answer = new StringBuilder();
        for (int card : cards) {
            answer.append(card).append(" ");
        }
        System.out.println(answer);
    }

    static void swap(int[] cards, int start, int end) {
        while (start <= end) {
            int temp = cards[start];
            cards[start] = cards[end];
            cards[end] = temp;
            start++;
            end--;
        }
    }
}
