import java.util.*;

class Solution {
    public int solution(int n) {
        // 초기화
        HashMap<Integer, Integer> map = new HashMap<>();
        String digitNumber = Integer.toString(3);
        
        // 매핑
        for(int i = 1, j = 1; i <= 100; i++, j++) {
            String strNum = Integer.toString(j);
            
            while(j % 3 == 0 || strNum.contains(digitNumber)) {
                j++;
                strNum = Integer.toString(j);
            }
            
            map.put(i, j);
        }
        
        return map.get(n);
    }
}