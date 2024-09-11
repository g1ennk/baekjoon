import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        // 1. 갈색과 노란색을 더해 합 구하기
        int total = brown + yellow;
        
        // 2. 경우의 수 구하기 (약수 구하기)
        // - W >= H
        // - W, H >= 2
        List<int[]> list = new ArrayList<>();
        for(int h = 3; h <= total; h++) {
            if(total % h == 0) {
                int w = total / h;
                int[] wh = {w, h};
                list.add(wh);
                
                if(h > w) {
                    break;
                }
            }
            
            
        }
        
        // 3. 노란색 타일 개수 검증하기
        for(int[] WH : list) {
            int W = WH[0];
            int H = WH[1];
            
            if((W - 2) * (H - 2) == yellow) {
                return WH;
            }
        }

        // 4. 리턴하기
        return null;
    }
}