import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        // 문자열 배열로 변환
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();
        
        // 정렬
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        
        // 문자열 다시 배열로 변환
        String sortedBefore = new String(beforeArray);
        String sortedAfter = new String(afterArray);
        
        // 정렬된 문자열이 같은지 확인
        return (sortedBefore.equals(sortedAfter)) ? 1 : 0;
    }
}