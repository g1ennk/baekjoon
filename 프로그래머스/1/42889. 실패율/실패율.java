import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> failRates = new HashMap<>();
        int challengers = stages.length;
        
        // 실패율 계산
        for(int i = 1; i <= N; i++) {
            int count = 0;
            for(int j = 0; j < stages.length; j++) {
                if(i == stages[j]) {
                    count++;
                }
            }
            if(challengers > 0) {
                failRates.put(i, (double) count / challengers);
            } else {
                failRates.put(i, 0.0);
            }
            challengers -= count;
        }
        
        // 실패율이 높은 것부터 내림차순으로 정렬, 만약 실패율이 같다면 작은 key 값을 먼저
        List<Map.Entry<Integer, Double>> list = new LinkedList<>(failRates.entrySet());
        
        list.sort((o1, o2) -> {
            if(o2.getValue().compareTo(o1.getValue()) == 0) {
                return o1.getKey().compareTo(o2.getKey());
            } else {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        int[] sortedStages = new int[N];
        for(int i = 0; i < list.size(); i++) {
            sortedStages[i] = list.get(i).getKey();
        } 
            
        return sortedStages;
    }
}