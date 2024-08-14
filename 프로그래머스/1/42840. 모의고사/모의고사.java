import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4 ,5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third  = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 수포자와 점수 매핑
        Map<Integer, Integer> scores = new HashMap<>();
        scores.put(1, getCountAnswers(first, answers));
        scores.put(2, getCountAnswers(second, answers));
        scores.put(3, getCountAnswers(third, answers));
        
        // 가장 높은 점수 찾기
        int maxScore = Collections.max(scores.values());
        
        // 가장 높은 점수를 가진 수포자 찾기
        List<Integer> bestStudents = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : scores.entrySet()) {
            if(entry.getValue() == maxScore) {
                bestStudents.add(entry.getKey());
            }
        }
        
        // 가장 높은 점수를 가진 수포자가 여러 명일 경우 오름차순 정렬
        Collections.sort(bestStudents);

        return bestStudents.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static int getCountAnswers(int[] tries, int[] answers) {
        int count = 0;
        for(int i = 0, j = 0; i < answers.length; i++, j++) {
            if(j == tries.length) {
                j = 0;
            }
            
            if(answers[i] == tries[j]) {
                count++;
            }
        }
        
        return count;
    }
}