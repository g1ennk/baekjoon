class Solution {
    public int solution(int num, int k) {
        
        // 변환
        String stringNum = Integer.toString(num);
        char charK = Character.forDigit(k, 10);
        
        // index 찾기
        int index = stringNum.indexOf(charK);
        
        return index == -1 ? -1 : index + 1;
    }
}