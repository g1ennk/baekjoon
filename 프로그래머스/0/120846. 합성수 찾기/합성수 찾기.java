class Solution {
    public int solution(int n) {
        // 초기화
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            int count = 0;
            
            // 약수 구하기
            for(int j = 1; j <= i; j++) {                
                if(i % j == 0) {
                    count++;
                }
            }
            
            // 합성수 체크
            if(count >= 3) {
                answer++;
            }
        }
        
        return answer;
    }
}