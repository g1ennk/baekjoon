// package algorithm_lecture.linkedList;

import java.util.*;

// 요세푸스 문제
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringJoiner sj = new StringJoiner(", ");
        StringBuilder sb = new StringBuilder();

        // 입력
        int N = sc.nextInt();
        int K = sc.nextInt();

        // 큐 추가
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 리스트가 빌 때까지 반복
        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.poll()); // 맨 앞에 있는 요소를 맨 뒤로
            }
            sj.add(queue.poll().toString()); // K번째 요소는 append
        }

        // 최종 결과 출력
        sb.append("<").append(sj).append(">");
        System.out.println(sb);
    }
}
