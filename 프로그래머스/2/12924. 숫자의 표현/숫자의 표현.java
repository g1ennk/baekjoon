class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            int total = 0;
            
            for (int num = i; total < n; num++) {
                total += num;
            }
            
            if (total == n) {
                count++;
            }
        }
        
        return count;
    }
}