class Solution {
    public int solution(int[] sides) {
        // 초기화
        int max = 0;
        int sum = 0;
        
        // 가장 긴 변 찾기
        for(int i = 0; i < sides.length; i++) {
            if(sides[i] > max) {
                max = sides[i];
            }
            sum += sides[i]; // 총합 구하기
        }
        sum = sum - max; // 가장 긴 변을 제외한 나머지 변들의 합
        
        // 긴 변 < 변1 + 변2
        return (max < sum) ? 1 : 2;
    }
}