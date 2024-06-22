import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        return pick(balls, share);
    }
    
    public BigInteger pick(int balls, int share) {
        return factorial(balls).divide(factorial(balls - share).multiply(factorial(share)));
    }
    
    public BigInteger factorial(int number) {
        BigInteger total = BigInteger.ONE;
        for(int i = 1; i <= number; i++) {
            total = total.multiply(BigInteger.valueOf(i));
        }
        return total;
    }
}