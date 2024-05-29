class Solution {
    public int solution(int n) {
        int factorial = 1;
        int factorialValue = 1;
        
        while(factorialValue <= n) {
            factorial++;
            factorialValue *= factorial;
        }
        
        return factorial - 1;
    }
}