import java.util.*;

class Solution {
     public static String solution(int[] numbers) {
        // 1. 정수 배열을 문자열 배열로 변환
        String[] numbersStr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersStr[i] = String.valueOf(numbers[i]);
        }

        // 2. 커스텀으로 정렬
        Arrays.sort(numbersStr, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        // 3. 정렬한 배열을 문자열로 붙이기
        StringBuilder sb = new StringBuilder();
        for (String numberStr : numbersStr) {
            sb.append(numberStr);
        }
        
        // 4. 예외 처리 (모두 0인 경우)
        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}