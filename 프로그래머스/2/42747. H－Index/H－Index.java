import java.util.*;

class Solution {
    public int solution(int[] citations) {
        // 1. 오름차순 정렬하기
        Arrays.sort(citations);
        int maxCitation = citations[citations.length - 1];
        int hIndex = 0;
        
        // 3. 최대 인용 횟수만큼 반복하기
        for(int h = 1; h <= maxCitation; h++) {
            int count = 0;
            for(int citation : citations) {
                if(citation >= h) {
                    count++;
                }
            }
            
            if(count >= h) {
                hIndex = h;
            }
        }
        
        // 4. H-index 리턴하기
        return hIndex;
    }
}