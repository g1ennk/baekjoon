import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_str.length(); i += n) {
            list.add(my_str.substring(i, Math.min(my_str.length(), i + n)));
        }
        
        String[] result = list.toArray(new String[0]);
        
        return result;
    }
}