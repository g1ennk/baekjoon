import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            
            // 현재 가격 이후의 가격들에 대해 체크합니다.
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                
                // 가격이 떨어지는 경우 체크합니다.
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
}
