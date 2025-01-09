// package algorithm_lecture.deque;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 테스트 케이스 수 입력 받기
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            ArrayDeque<String> deque;
            boolean reversed = false;
            boolean error = false;

            // 2. 명령어 입력받기
            String command = br.readLine();

            // 3. 배열의 개수 입력받기
            int n = Integer.parseInt(br.readLine());

            // 4. 배열 입력받고 파싱하기
            deque = parsing(br.readLine(), n);

            // 5. 명령어 수행하기
            for (char c : command.toCharArray()) {
                if (c == 'R') {
                    reversed = !reversed;
                } else {
                    if (deque.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (reversed) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            // 6. 빌딩하기
            if (error) {
                bw.write("error\n");
            } else {
                bw.write("[");
                while (!deque.isEmpty()) {
                    if (reversed) {
                        bw.write(deque.pollLast());
                    } else {
                        bw.write(deque.pollFirst());
                    }
                    if (!deque.isEmpty()) {
                        bw.write(",");
                    }
                }
                bw.write("]\n");
            }

        }

        // 7. 출력하기
        bw.flush();
    }

    static ArrayDeque<String> parsing(String str, int n) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        if (n > 0) {
            str = str.substring(1, str.length() - 1);
            String[] tokens = str.split(",");
            for (String token : tokens) {
                deque.add(token);
            }
        }
        return deque;
    }
}
