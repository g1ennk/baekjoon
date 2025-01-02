// package algorithm_lecture.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        // 1. 정수 N 입력받기
        int N = Integer.parseInt(br.readLine());

        // 2. 1부터 N까지 큐에 넣기
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        // 3. 1장이 남을 때까지
        while (queue.size() != 1) {
            queue.poll(); // 제일 위 카드 버리고
            queue.offer(queue.poll());
        }

        // 4. 마지막 남은 카드 출력
        bw.write(String.valueOf(queue.poll()));
        bw.flush();
    }
}