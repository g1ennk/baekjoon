// package algorithm_lecture.bfs;

import java.io.*;
import java.util.*;

// 연습 문제 1697: 숨바꼭질
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 수빈이의 위치 N과 동생의 우치 K 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 2. 탐색
        int minTime = bfs(N, K);

        // 3. 결과 출력
        bw.write(minTime + "\n");
        bw.flush();
    }

    static int bfs(int N, int K) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001];

        // 초기 방문 처리
        queue.add(new int[]{N, 0});
        visited[N] = true;

        while (!queue.isEmpty()) {
            // 꺼내기
            int cur[] = queue.poll();
            int position = cur[0];
            int time = cur[1];

            // 종료조건
            if (position == K) {
                return time;
            }

            // 방향
            int[] nextPosition = new int[]{position * 2, position + 1, position - 1};
            for (int next : nextPosition) {
                // 범위 체크
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, time + 1});
                }
            }
        }

        return -1;
    }
}
