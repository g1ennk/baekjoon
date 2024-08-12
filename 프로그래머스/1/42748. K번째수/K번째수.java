import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int N = commands.length;
        int[] answer = new int[N];
        
        for(int i = 0; i < N; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int index = commands[i][2] - 1;
            
            int[] tempArray = Arrays.copyOfRange(array, start, end);
            Arrays.sort(tempArray);
            answer[i] = tempArray[index];
        }
        
        return answer;
    }
}