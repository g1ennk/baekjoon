import java.util.*;

class Solution {
    public static int solution(String[][] clothes) {
        //  1. 해시맵 초기화
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String clothType = clothe[1];
            map.put(clothType, map.getOrDefault(clothType, 0) + 1);
        }

        // 2. 경우의 수 계산하기
        int combination = 1;
        for (Integer value : map.values()) {
            combination *= value + 1; // 아무것도 선택하지 않는 경우르 포함하기 위해
        }

        return combination - 1; // 아예 아무것도 입지 않는 경우의 수를 제외하기 위해
    }
}