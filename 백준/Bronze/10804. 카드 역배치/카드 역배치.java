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
            int start = sc.nextInt();
            int end = sc.nextInt();
            swap(cards, start, end);
        }

        // 3. 결과 출력
        for (int number : cards) {
            System.out.print(number + " ");
        }
    }

    static void swap(int[] cards, int start, int end) {
        for (int i = start; i <= end; i++) {
            int temp = cards[i - 1];
            cards[i - 1] = cards[end - 1];
            cards[end - 1] = temp;
            end--;
        }
    }
}
