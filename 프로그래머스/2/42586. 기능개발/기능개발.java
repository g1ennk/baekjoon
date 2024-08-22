import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List <Integer> list = new ArrayList<>();
        Queue <Integer> queue = new ArrayDeque<>();
        
        // 1. 배열을 돌면서 작업 기간 계산하기
        for(int i = 0; i < progresses.length; i++) {
            // 1-1. 계산 ((100 - progress) / speed)
            int requiredDay = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            
            // 1-2. 큐에 넣기
            queue.offer(requiredDay);
        }
           
        // 2. 큐를 하나씩 빼면서 처음 작업을 기준으로 작다면 카운트 올리고, 크다면 리스트에 추가 후 카운트 초기화
        while(!queue.isEmpty()) {
            int standard = queue.poll();
            int count = 1;
            
            while(!queue.isEmpty() && queue.peek() <= standard) {
                count++;
                queue.poll();
            }
            list.add(count);
            
        }
        
        // 3. 리스트를 배열로 변환하여 리턴
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}
