class Solution {
    boolean solution(String s) {
        // 대소문자 구분 없이 비교하기 위해 입력 문자열을 모두 대문자로 변환
        s = s.toUpperCase();
        
        // 'P'와 'Y'의 개수를 저장할 변수 초기화
        int pCount = 0;
        int yCount = 0;

        // 문자열의 각 문자를 검사하여 'P'와 'Y'의 개수를 센다
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'P') {
                pCount++;
            } else if (ch == 'Y') {
                yCount++;
            }
        }
        
        // 'P'와 'Y'의 개수가 같은지 확인하여 결과를 반환
        return pCount == yCount;
    }
}
