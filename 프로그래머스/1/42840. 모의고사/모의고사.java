import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자 패턴
        int[] firstPattern = {1, 2, 3, 4, 5};
        int[] secondPattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdPattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 각각의 수포자들의 정답 배열
        int[] countArr = new int[3];
        countArr[0] = getCount(firstPattern, answers);
        countArr[1] = getCount(secondPattern, answers);
        countArr[2] = getCount(thirdPattern, answers);
        
        // 순회하면서 가장 높은 점수를 가진 수포자 구하기(가장 높은 점수를 가진 수포자가 여러 명일 때도 추가)
        List<Integer> bestStudentList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > max) {
                max = countArr[i];
                bestStudentList.clear();
            }
            
            if (countArr[i] == max) {
                bestStudentList.add(i + 1);
            }
            
        }

        return bestStudentList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // 패턴에 맞는 정답 구하기
    public int getCount(int[] pattern, int[] answers) {
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern[i % pattern.length]) {
                count++;
            }
        }

        return count;
    }   
}