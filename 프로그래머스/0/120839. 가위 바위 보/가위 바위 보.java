// 두 번째 코드 (StringBuilder 사용)
class Solution {
    public String solution(String rsp) {
        
        // 초기화
        int length = rsp.length();
        StringBuilder answer = new StringBuilder();
        
        // 반복문을 돌며 케이스 검사
        for(int i = 0; i < length; i++) {
            char c = rsp.charAt(i);
            
            switch (c) {
                case '2':
                    answer.append('0');
                    break;
                
                case '0':
                    answer.append('5');
                    break;
                    
                case '5':
                    answer.append('2');
                    break;
            }
        }
        
        return answer.toString();
    }
}