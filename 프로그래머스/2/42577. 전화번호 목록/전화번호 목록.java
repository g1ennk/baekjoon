import java.util.*;

class Solution {
     public static boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();

        for (String number : phone_book) {
            set.add(number);
        }

        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {
                // 접두어가 HashSet에 존재하면 false 반환
                if (set.contains(number.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}