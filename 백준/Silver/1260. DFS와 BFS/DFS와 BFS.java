// package ktb.morningStudy._250414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 정점 수, 간선 수, 시작 노드
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());

        // 2. 그래프 초기화
        graph = new ArrayList[N + 1]; // 정점 번호가 1번부터 시작하기 때문에
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 3. 간선 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            // 무방향 그래프
            graph[start].add(end);
            graph[end].add(start);
        }

        // 4. 방문할 수 있는 정점이 여러 개 -> 작은 것부터 먼저 방문하기 위해 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // 5. DFS
        visited = new boolean[N + 1];
        dfs(startNode);
        System.out.println();

        // 6. BFS
        visited = new boolean[N + 1];
        bfs(startNode);
    }

    static void dfs(int startNode) {
        visited[startNode] = true;
        System.out.print(startNode + " ");

        for (int next : graph[startNode]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " ");

            for (int next : graph[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }

    }

}

