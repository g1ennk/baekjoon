import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int startIdx = commands[i][0] - 1;
            int endIdx = commands[i][1];
            int selectIdx = commands[i][2] - 1;
            
            // 1. 자르고(i-1 ~ k)
            int[] newArr = Arrays.copyOfRange(array, startIdx, endIdx);
                    
            // 2. 정렬하고(오름차순)
            Arrays.sort(newArr);

            // 3. k번째 수 뽑기
            answer[i] = newArr[selectIdx];
        }
        
        return answer;
    }
}