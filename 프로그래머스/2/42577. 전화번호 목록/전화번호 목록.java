import java.util.*;

class Solution {
     public static boolean solution(String[] phone_book) {
        // 1. 전화번호를 길이순으로 정렬
        Arrays.sort(phone_book);
        
        // 2. 인접한 번호들을 비교
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        // 접두어가 아니면 true 반환
        return true;
    }
}