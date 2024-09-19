
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 프린터 큐
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 테스트 케이스의 수 입력 받기
        int t = sc.nextInt();
        int[] answers = new int[t];

        // 2. 해당 수만큼 루프 돌며 정보 입력 받기
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // 문서의 개수
            int targetIndex = sc.nextInt(); // 목표 문서의 인덱스
            int[] priorities = new int[n];

            for (int j = 0; j < n; j++) {
                priorities[j] = sc.nextInt(); // 각 문서의 우선순위 입력
            }

            answers[i] = calculateOrder(priorities, targetIndex); // 우선순위 처리 계산
        }

        // 3. 결과 출력하기
        for (int answer : answers) {
            System.out.println(answer);
        }
    }

    static int calculateOrder(int[] priorities, int targetIndex) {
        // 1. 우선순위 배열을 큐에 넣기
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]}); // {문서 인덱스, 우선순위}
        }

        // 2. 큐가 빌 때까지 반복
        int order = 0;
        while (!queue.isEmpty()) {
            boolean isBiggest = true;
            int[] current = queue.poll();
            int currentIndex = current[0]; // 현재 문서의 인덱스
            int currentPriority = current[1]; // 현재 문서의 우선순위

            for (int[] q : queue) {
                if (q[1] > currentPriority) {
                    isBiggest = false;
                    break;
                }
            }

            // 가장 크면 Poll, 아니면 다시 큐에 넣기
            if (isBiggest) {
                order++;
                if (targetIndex == currentIndex) {
                    return order;
                }
            } else {
                queue.add(current);
            }
        }

        return -1;
    }
}
