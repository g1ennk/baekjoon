import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        
        // 문자열 이진수를 10진수로 변환
        int a = Integer.parseInt(bin1, 2); 
        int b = Integer.parseInt(bin2, 2);
        
        return  Integer.toBinaryString(a + b); // 10진수를 이진수 문자열로 변환
    }
}