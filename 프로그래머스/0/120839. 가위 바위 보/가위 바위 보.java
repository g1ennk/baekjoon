class Solution {
    public String solution(String rsp) {
        
        // 초기화
        int length = rsp.length();
        String answer = "";
        
        // 반복문을 돌며 케이스 검사
        for(int i = 0; i < length; i++) {
            char c = rsp.charAt(i);
            
            switch (c) {
                case '2':
                    answer += '0';
                    break;
                
                case '0':
                    answer += '5';
                    break;
                    
                case '5':
                    answer += '2';
                    break;
            }
        }
        
        return answer;
    }
}