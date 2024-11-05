import java.util.Scanner;

public class Main {

    private static int[][] field;
    private static boolean[][] visited;
    private static int M,N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 테스트 케이스 T 받기
        int T = scanner.nextInt();
        int[] answers = new int[T];

        // 2. 테스트 케이스만큼 실행하기
        for (int i = 0; i < T; i++) {
            // 3. 가로 M,  새로 N, 배추 위치의 개수 K 입력받기
            M = scanner.nextInt();
            N = scanner.nextInt();
            int K = scanner.nextInt();

            // 4. 배추밭 초기화
            initField(M, N);

            // 5. 배추 위치 입력 받아 필드에 표기
            for (int j = 0; j < K; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                field[y][x] = 1;
            }

            // 6. 지렁이 개수를 계산하기
            answers[i] = calculateWarmCount();

        }

        // 7. 정답 출력하기
        for (int answer : answers) {
            System.out.println(answer);
        }

        scanner.close();
    }

    private static int calculateWarmCount() {
        int warmCount = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (field[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    warmCount++;
                }
            }
        }

        return warmCount;
    }

    private static void initField(int M, int N) {
        field = new int[N][M];
        visited = new boolean[N][M];
    }

    private static void dfs(int x, int y) {
        // 범위를 벗어나는 경우 + 이미 방문한 경우 + 배추가 있는 경우
        if (x < 0 || y < 0 || x >= N || y >= M || visited[x][y] || field[x][y] == 0) {
            return;
        }

        visited[x][y] = true;

        // 상하좌우 확인하기
        dfs(x, y + 1);
        dfs(x, y - 1);
        dfs(x - 1, y);
        dfs(x + 1, y);
    }

}
