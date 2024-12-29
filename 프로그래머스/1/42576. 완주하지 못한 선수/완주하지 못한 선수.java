import java.util.*;

import java.util.*;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가한 선수 해시멥에 저장
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 완주한 선수는 빼기 처리
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        // 값이 0보다 크면 완주못한 선수 바로 반환
        for (String p : map.keySet()) {
            if (map.get(p) > 0) {
                return p;
            }
        }

        return null;
    }
}