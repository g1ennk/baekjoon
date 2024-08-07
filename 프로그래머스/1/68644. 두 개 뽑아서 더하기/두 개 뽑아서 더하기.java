import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // Set 초기화
        HashSet<Integer> sumSet = new HashSet<>();
        
        // 이중 반복문을 통해 두 개의 숫자를 뽑아 더해 sumSet에 저장
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }
        
        // stream -> Integer -> int -> array
        return sumSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}