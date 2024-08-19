import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 중복 제거를 위해 배열의 요소를 해시셋에 추가
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // 최대로 고를 수 있는 수와 고유한 폰켓몬 수 중 작은 값 반환
        return Math.min(set.size(), nums.length / 2);
    }
}
