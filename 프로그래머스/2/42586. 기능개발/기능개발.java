import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int N = progresses.length;
        
        // 1. 각 작업에 필요한 날짜를 계산한 후 큐에 삽입
        for(int i = 0; i < N; i++) {
            int daysRequired = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.offer(daysRequired);
        }
        
        // 2. 모든 작업이 끝날 때까지 배포 가능한 작업 그룹을 계산
        while(!queue.isEmpty()) {
            int count = 1;
            int target = queue.poll();
            
            while(!queue.isEmpty() && queue.peek() <= target) {
                count++;
                queue.poll();
            }
            
            list.add(count);
        }
        
        // 리스트를 배열로 변환
        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
