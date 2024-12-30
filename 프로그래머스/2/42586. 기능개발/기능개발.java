import java.util.*;

class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> deployments = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        // 1. 작업 기간 계산
        for (int i = 0; i < progresses.length; i++) {
            int remainingWorks = 100 - progresses[i];
            int requiredDay = (int)Math.ceil((double)remainingWorks / speeds[i]); // 올림 처리
            // int requiredDay = (remainingWorks + speeds[i] - 1) / speeds[i];
            queue.offer(requiredDay);
        }

        // 2. 각 배포마다 몇 개 기능 개발 가능한지 계산
        while (!queue.isEmpty()) {
            // 초기 작업 세팅
            int current = queue.poll();
            int feature = 1;

            // 초기 작업보다 적은 개발 기간은 빼고, 더 긴 작업이 나올 경우 탈출
            while (!queue.isEmpty() && current >= queue.peek()) {
                queue.poll();
                feature++;
            }
            deployments.add(feature);
        }

        return deployments.stream().mapToInt(Integer::intValue).toArray();
    }
}
