import java.util.HashMap;
import java.util.Map;

class Solution {
    public long solution(String numbers) {
        // 숫자 단어를 숫자에 매핑하는 HashMap
        Map<String, String> numberMap = new HashMap<>();
        numberMap.put("zero", "0");
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");
        
        // 결과 문자열
        StringBuilder result = new StringBuilder();
        
        // 단어 찾기
        StringBuilder currentWord = new StringBuilder();
        for(char c : numbers.toCharArray()) {
            currentWord.append(c);
            if(numberMap.containsKey(currentWord.toString())) {
                result.append(numberMap.get(currentWord.toString()));
                currentWord.setLength(0);
            }
        }
        
        // 변환된 문자열을 정수로 변환
        return Long.parseLong(result.toString());
    }
}