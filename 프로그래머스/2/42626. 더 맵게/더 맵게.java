import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue <Integer> pQ = new PriorityQueue<>();
        int count = 0;

        // 1. 우선순위 큐에 집어넣기
        for(int scov : scoville) {
            pQ.add(scov);
        }
        
        // 2. 큐를 돌면서 K보다 작은 게 없을 때까지 섞기 (없다면)
        while (pQ.size() > 1 && pQ.peek() < K) {
            int first = pQ.poll();
            int second = pQ.poll();
            pQ.add(first + (second * 2));
            count++;
        }
        
        // 3. 섞어야 하는 횟수 리턴하기
        return (pQ.peek() < K) ? -1 : count;
    }
}