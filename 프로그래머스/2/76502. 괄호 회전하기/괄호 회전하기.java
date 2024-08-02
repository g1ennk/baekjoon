import java.util.*;

class Solution {
    public int solution(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        
        for(int i = 0; i < s.length(); i++) {
            if (isProperBracket(sb.toString())) {
                count++;
            }
            
            sb.append(sb.charAt(0)).deleteCharAt(0);
        }

        return count;
    }
    
    public static boolean isProperBracket(String bracket) {
        Map <Character, Character> map = new HashMap<>();
        Stack <Character> stack = new Stack<>();
        
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        for(int i = 0; i < bracket.length(); i++) {
            char c = bracket.charAt(i);
            
            if(!map.containsKey(c)) {
                stack.push(c);
            } else {
                if(stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }
                
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}
