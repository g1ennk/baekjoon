import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map <String, Integer> map = new HashMap<>();
        
        int answer = 1;
        for(int i = 0; i < clothes.length; i++) {
            String clothesType = clothes[i][1];
            map.put(clothesType, map.getOrDefault(clothesType, 0) + 1);
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = entry.getValue() + 1;
            answer *= count;
        }
        
        return answer - 1;
    }
}


