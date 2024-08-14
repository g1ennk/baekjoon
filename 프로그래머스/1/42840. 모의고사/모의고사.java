import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자 정답 패턴
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 각각의 수포자와 점수 매핑
        Map<Integer, Integer> scores = new HashMap<>();
        scores.put(1, getAnswerCount(answers, first));
        scores.put(2, getAnswerCount(answers, second));
        scores.put(3, getAnswerCount(answers, third));
        
        // 가장 큰 점수 찾기
        int maxScore = Collections.max(scores.values());
        
        // 가장 큰 점수를 가진 수포자 찾기
        List<Integer> topScorers = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : scores.entrySet()) {
            if(entry.getValue() == maxScore) {
                topScorers.add(entry.getKey());
            }
        }
        
        // 여러 명일 경우 오름차순 정렬
        Collections.sort(topScorers);
        
        // 배열로 바꾼 후 리턴
        return topScorers.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int getAnswerCount(int[] answers, int[] pattern) {
        int correctCount = 0;
        int patternLength = pattern.length;
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == pattern[i % patternLength]) {
                correctCount++;
            }
        }
        
        return correctCount;
    }
}