import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue <Integer> pQ = new LinkedList<>();
        Queue <Integer> lQ = new LinkedList<>();
        
        // 1. 우선순위 배열을 큐에 넣기
        for (int i = 0; i < priorities.length; i++) {
            pQ.offer(priorities[i]);
            lQ.offer(i);
        }
        
        // 2. 하나씩 빼면서 비교하기
        int count = 0;
        while(!pQ.isEmpty()) {
            int target = pQ.poll();
            int targetIndex = lQ.poll();
            
            // 2.1. 큐를 순회하면서 우선순위를 비교(높은 게 있으면 break)
            boolean hasHigerPririty = false;
            for(Integer priority : pQ) {
                if(priority > target) {
                    hasHigerPririty = true;
                    break;
                }
            }
            
            // 2.2. 높은 게 있다면 뽑은 프로세스를 다시 큐에 넣기
            if(hasHigerPririty) {
                pQ.offer(target);
                lQ.offer(targetIndex);
            } else {
                // 없다면 실행순서 늘리기 + 뽑은 프로세스의 인덱스와 location이 값다면 실행 순서를 리턴하면서 종료
                count++;
                if(targetIndex == location) {
                    return count;
                }
            }
            
        }
        
        return 0;
    }
}