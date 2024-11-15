// package samsung.problemSolving.basic.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1219. [S/W 문제해결 기본] 4일차 - 길찾기 D4
public class Solution {
    static List<List<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개의 테스트 케이스
        for (int t = 1; t <= 10; t++) {
            int testNumber = sc.nextInt();
            int edges = sc.nextInt();

            // 1. 그래프 초기화
            graph = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                graph.add(new ArrayList<>());
            }

            // 2. 간선 정보 입력 받기
            for (int i = 0; i < edges; i++) {
                int from = sc.nextInt();
                int to = sc.nextInt();
                graph.get(from).add(to);
            }

            // 3. 방문 배열 및 경로 찾기 여부 초기화
            visited = new boolean[100];

            // 4. 경로 탐색 후 결과 출력
            System.out.printf("#%d %d\n", testNumber, dfs(0) ? 1 : 0);
        }

        sc.close();
    }

    static boolean dfs(int node) {
        // 노드 99를 찾는 순간 조기 종료
        if (node == 99) {
            return true;
        }

        // 현재 노드 방문 처리
        visited[node] = true;

        // 인접 노드 탐색
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor] && dfs(neighbor)) {
                return true;
            }
        }
        
        return false; // 경로가 없을 때 
    }

}
