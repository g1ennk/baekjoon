import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] failRates = new double[N];
        Integer[] stageIndexes = new Integer[N];

        // 1. 실패율 계산
        for (int i = 1; i <= N; i++) {
            int playersReached = 0;
            int playersStuck = 0;

            // 각 스테이지에 대한 통계 계산
            for (int stage: stages) {
                if (stage >= i) {
                    playersReached++;
                }
                if (stage == i) {
                    playersStuck++;
                }
            }

            // 실패율 계산
            failRates[i - 1] = (playersReached == 0) ? 0 : (double) playersStuck / playersReached;
            stageIndexes[i - 1] = i;
        }

        // 2. 실패율을 기준으로 스테이지 인덱스 정렬
        Arrays.sort(stageIndexes, (a, b) 
                    // 같은 경우 번호를 가지고 오름차순 정렬
                    -> Double.compare(failRates[b - 1], failRates[a - 1]) == 0 
                    ? a - b 
                    // 아닌 경우 실패율을 가지고 내림차순 정렬
                    : Double.compare(failRates[b - 1], failRates[a - 1])); 

        // 3. 정렬된 스테이지 인덱스를 결과로 반환
        return Arrays.stream(stageIndexes).mapToInt(Integer::intValue).toArray();
    }
}