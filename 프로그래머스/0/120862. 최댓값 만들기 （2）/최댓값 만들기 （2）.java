class Solution {
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int multiply = numbers[i] * numbers[j];
                if(multiply > max) {
                    max = multiply;
                }
            }
        }
        
        return max;
    }
}