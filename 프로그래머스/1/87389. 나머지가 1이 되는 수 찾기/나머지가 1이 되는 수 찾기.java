class Solution {
    public int solution(int n) {
        int min = Integer.MAX_VALUE;
        
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 1 && i < min) {
                min = i;
            } 
        }
        
        return min;
    }
}