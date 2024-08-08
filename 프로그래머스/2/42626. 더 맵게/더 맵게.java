import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        int count = 0;
        
        for(int s : scoville) {
            pQ.offer(s);
        }
        
        while(pQ.size() >= 2 && pQ.peek() < K) {
            int first = pQ.poll();
            int second = pQ.poll();
            int newOne = first + (second * 2);
            
            pQ.offer(newOne);
            count++;
        }
        
        return (pQ.peek() < K) ? -1 : count;
    }
}