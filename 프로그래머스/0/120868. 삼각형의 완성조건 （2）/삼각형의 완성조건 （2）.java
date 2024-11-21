import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int sum = 0;
        
        // 1. 주어진 변들 중 하나가 가장 긴 경우
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];
        sum += max - (max - min) + 1;
        
        // 2. 나머지 한 변이 가장 긴 경우
        sum += (max + min - 1) - (max + 1);
        
        return sum;
    }
}