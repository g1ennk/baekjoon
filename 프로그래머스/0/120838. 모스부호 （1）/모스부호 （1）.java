import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        // 초기화
        StringBuilder answer = new StringBuilder();
        String[] mossLetters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        // 모스 부호를 알파벳으로 매핑하는 HashMap
        HashMap<String, Character> mossToAlphabet = new HashMap<>();
        for(int i = 0; i < mossLetters.length; i++) {
            mossToAlphabet.put(mossLetters[i], (char)(i + 'a'));
        }
        
        // 입력 문자열을 공백을 기준으로 분할
        String letters[] = letter.split(" ");
        
        // 각 모스 부호를 알파벳으로 변환하여 결과에 추가
        for(String morse : letters) {
            if(mossToAlphabet.containsKey(morse)) {
                answer.append(mossToAlphabet.get(morse));
            }
        }        
        
        return answer.toString();
    }
}