import java.util.*;

class Solution {
    
    // 객체 클래스 만들기
    private static class Process {
        int priority;
        int index;
        
        Process(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
        
    }
    public int solution(int[] priorities, int location) {
        Queue <Process> pQ = new LinkedList<>();
        
        // 1. 우선순위 배열을 큐에 넣기
        for (int i = 0; i < priorities.length; i++) {
            pQ.offer(new Process(priorities[i], i));
        }
        
        // 2. 하나씩 빼면서 비교하기
        int count = 0;
        
        while(!pQ.isEmpty()) {
            Process targetProcess = pQ.poll();
            
            // 2.1. 큐를 순회하면서 우선순위를 비교(높은 게 있으면 break)
            boolean hasHigerPririty = false;
            for(Process process : pQ) {
                if(process.priority > targetProcess.priority) {
                    hasHigerPririty = true;
                    break;
                }
            }
            
            // 2.2. 높은 게 있다면 뽑은 프로세스를 다시 큐에 넣기
            if(hasHigerPririty) {
                pQ.offer(targetProcess);
            } else {
                // 없다면 실행순서 늘리기 + 뽑은 프로세스의 인덱스와 location이 값다면 실행 순서를 리턴하면서 종료
                count++;
                if(targetProcess.index == location) {
                    return count;
                }
            }
            
        }
        
        return 0;
    }
}