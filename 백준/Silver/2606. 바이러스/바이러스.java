import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 바이러스
public class Main {

    private static LinkedList<Integer>[] adjList;
    private static boolean[] visited;
    private static int infectedCount = 0;

    private static void addEdge(int from, int to) {
        adjList[from].add(to);
        adjList[to].add(from);
    }

    private static void dfs(int node) {
        visited[node] = true;
        infectedCount++;

        for (int nextNode : adjList[node]) {
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }

    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(node);
        visited[node] = true;
        infectedCount++;

        while (!queue.isEmpty()) {
            int poppedNode = queue.poll();

            for (int nextNode : adjList[poppedNode]) {
                if (!visited[nextNode]) {
                    queue.add(nextNode);
                    visited[nextNode] = true;
                    infectedCount++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 컴퓨터의 수와 연결되어 있는 컴퓨터 쌍의 수 입력받기
        int numOfComputers = scanner.nextInt();
        int numOfConnectedComputers = scanner.nextInt();

        // 2. 인접 리스트 및 방문 배열 초기화
        adjList = new LinkedList[numOfComputers + 1];
        for (int i = 1; i <= numOfComputers; i++) {
            adjList[i] = new LinkedList<>();
        }
        visited = new boolean[numOfComputers + 1];

        // 3. 간선 정보 입력
        for (int i = 0; i < numOfConnectedComputers; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();

            addEdge(from, to);
        }

        // 4. 탐색 시작
        dfs(1);
        // bfs(1);

        // 5. 결과 출력
        System.out.println(infectedCount - 1); // 1번 컴퓨터는 제외해야 하므로

        scanner.close();
    }
}
