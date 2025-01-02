// package algorithm_lecture.queue;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();

        // 1. 명렁어의 개수 입력받기
        int N = Integer.parseInt(br.readLine());

        // 2. 명령어 실행
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append((!queue.isEmpty()) ? String.valueOf(queue.poll()) : "-1").append("\n");
                    break;

                case "size":
                    sb.append(queue.size()).append("\n");
                    break;

                case "empty":
                    sb.append((queue.isEmpty()) ? "1" : "0").append("\n");
                    break;

                case "front":
                    sb.append((!queue.isEmpty()) ? queue.peekFirst() : "-1").append("\n");
                    break;

                case "back":
                    sb.append((!queue.isEmpty()) ? queue.peekLast() : "-1").append("\n");
            }
        }
        
        // 3. 결과 출력
        bw.write(sb.toString());
        bw.flush();
    }
}
