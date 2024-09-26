import java.util.*;

class Solution {
    static final int[][] PATTERNS = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };
    
    public int[] solution(int[] answers) {
        int maxScore = Integer.MIN_VALUE;
        List<Integer> topScorers = new ArrayList<>();

        for (int i = 0; i < PATTERNS.length; i++) {
            // 1. 스코어 계산
            int score = 0;
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == PATTERNS[i][j % PATTERNS[i].length]) {
                    score++;
                }
            }

            // 2. 점수 갱신 및 최고득점자 갱신
            if (score > maxScore) {
                topScorers.clear(); // 기존 최고 득점자 목록 초기화
                maxScore = score;
                topScorers.add(i + 1);
            } else if (score == maxScore) {
                // 현재 수포자 점수가 최고 점수자와 같다면 목록에 추가
                topScorers.add(i + 1);
            }

        }

        return topScorers.stream().mapToInt(Integer::intValue).toArray();
    }
}