import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 새로운 배열의 크기 계산 및 초기화
        int newSize = num2 - num1 + 1;
        int[] newNumbers = new int[newSize];
        
        // arraycopy를 활용한 슬라이스
        System.arraycopy(numbers, num1, newNumbers, 0, newSize);
        
        return newNumbers;
    }
}