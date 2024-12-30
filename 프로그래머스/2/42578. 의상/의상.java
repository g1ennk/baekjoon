import java.util.*;

class Solution {
    public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }

        int count = 1;
        for (String key : map.keySet()) {
            count *= map.get(key) + 1;
        }

        return count - 1;
    }
}