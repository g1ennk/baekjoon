import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int commandsLen = commands.length;
        int answer[] = new int[commandsLen];
        
        // 1. commands의 길이만큼 반복한다.
        for(int i = 0; i < commandsLen; i++){
            int startIdx = commands[i][0] - 1;
            int endIdx = commands[i][1];
            int pickIdx = commands[i][2] - 1;
            
            // 1-1. commands[0]부터 commands[1]까지 배열을 자른다.
            int[] slicedArray = Arrays.copyOfRange(array, startIdx, endIdx);
            
            // 1-2. 자른 배열을 오름차순으로 정렬한다.
            Arrays.sort(slicedArray);
            
            // 1-3. 배열의 commands[2]번째 수를 정답 배열에 저장한다.
            answer[i] = slicedArray[pickIdx];
        }
            
        
        // 2. 정답 배열을 리턴한다.
        return answer;
    }
}