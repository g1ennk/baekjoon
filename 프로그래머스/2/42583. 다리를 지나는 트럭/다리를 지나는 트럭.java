import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int currentWeight = 0;
        int N = truck_weights.length;
        Queue <Integer> readyQ = new LinkedList<>();
        Queue <Integer> bridgeQ = new LinkedList<>();
        
        for(int truct : truck_weights) {
            readyQ.offer(truct);
        }
        
        // 다리 큐는 처음에 트럭이 없는 상태로 bridge_length 크기의 0으로 채움
        for (int i = 0; i < bridge_length; i++) {
            bridgeQ.offer(0);
        }
        
        while(!bridgeQ.isEmpty()) {
            currentWeight -= bridgeQ.poll();
            
            if(!readyQ.isEmpty()) {
                if(currentWeight + readyQ.peek() <= weight) {
                    int inTruck = readyQ.poll();
                    bridgeQ.offer(inTruck);
                    currentWeight += inTruck;
                } else {
                    bridgeQ.offer(0);
                }
            }
            
            time++;
        }
        
        return time;
    }
}