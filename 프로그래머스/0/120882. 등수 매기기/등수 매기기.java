import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        // 평균 점수 구해서 점수와 인덱스 2차원 배열 만들기
        int n = score.length; // 점수 개수
        double[] averages = new double[n];
        for(int i = 0; i < n; i++) {
            averages[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        // 정렬을 위한 새로운 배열 만들고 오름차순 정렬
        double[] sortedAverages = averages.clone();
        Arrays.sort(sortedAverages);
        
        // 점수와 등수 매핑하기
        Map<Double, Integer> rankMap = new HashMap<>();
        for(int i = n - 1; i >= 0; i--) {
            if(!rankMap.containsKey(sortedAverages[i])) {
                rankMap.put(sortedAverages[i], n - i);
            }
        }
        
        // 기존 배열을 기준으로 등수 매기기
        int[] ranks = new int[n];
        for(int i = 0; i < n; i++) {
            ranks[i] = rankMap.get(averages[i]);
        }
        
        return ranks;
    }
}