import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        // 초기화
        String answer = "";
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            // set에 없다는 건 첫 번째 등장하는 문자라는 뜻
            if(!set.contains(c)) {
                set.add(c);
                answer += c;
            }
        }
        
        return answer;
    }
}