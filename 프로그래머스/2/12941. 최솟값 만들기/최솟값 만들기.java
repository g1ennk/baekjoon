import java.util.*;

class Solution
{
    public int solution(int[] A, int[] B) {
        // 1. 오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        // 2. 각각의 누적 구하기
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            total += A[i] * B[B.length - 1 - i];
        }

        return total;
    }
}