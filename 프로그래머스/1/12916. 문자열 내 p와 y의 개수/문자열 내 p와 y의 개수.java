class Solution {
    boolean solution(String s) {
        
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;

        // 문자열을 대문자로 변환하여 다시 저장
        s = s.toUpperCase();
        
        for(int i = 0; i < s.length(); i++) {
            // 문자열의 각 문자를 검사하여 'P'와 'Y'의 개수를 센다
            if(s.charAt(i) == 'P') {
                pCount++;
            }
            
            if(s.charAt(i) == 'Y') {
                yCount++;
            }
        }
        
        // 'P'와 'Y'의 개수가 같은지 확인하여 answer를 설정
        answer = (pCount == yCount) ? true : false;
        
        return answer;
    }
}
