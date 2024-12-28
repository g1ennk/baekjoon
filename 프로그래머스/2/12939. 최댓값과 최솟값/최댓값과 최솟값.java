import java.util.*;

class Solution {
    public String solution(String s) {
        StringJoiner sj =  new StringJoiner(" ");
        
        // 1. 배열로 변환하기
        String[] array = s.split(" ");
        
        // 2. 최댓값, 최솟값 찾기
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String str : array) {
            max = Math.max(max, Integer.parseInt(str));
            min = Math.min(min, Integer.parseInt(str));
        }
        
        return sj.add(String.valueOf(min)).add(String.valueOf(max)).toString();
    }
}