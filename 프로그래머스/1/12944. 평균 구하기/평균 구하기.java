class Solution {
    public double solution(int[] arr) {
        int total = 0;
        
        for (int number : arr) {
            total += number;
        }
                
        return (double) total / arr.length;
    }
}