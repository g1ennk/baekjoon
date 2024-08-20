import java.util.*;

import java.util.*;

class Solution {
    public String solution(String[] participants, String[] completion) {
        Map <String, Integer> map = new HashMap<>();
        
        // 참가자 목록을 돌면서 이름을 맵에 저장 (이름이 이미 있으면 수를 증가)
        for(String participant : participants) {
            map.put(participant, map.getOrDefault(participant, 0) + 1);
        }
        
        // 완주자 목록을 돌면서 참가자 수를 감소시킴
        for(String participant : completion) {
            map.put(participant, map.get(participant) - 1);
                
            if(map.get(participant) == 0) {
                map.remove(participant);
            }
        }
        
        // 맵에 남은 유일한 참가자 이름을 반환
        return map.keySet().iterator().next();
    }
}