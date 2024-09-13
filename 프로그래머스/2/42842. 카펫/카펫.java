import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        // 1. 전체 길이 구하기
        int total = brown + yellow;

        // 2. 가능한 가로, 세로 길이 구하기
        // - 가로, 세로 >= 3
        // - 가로 >= 세로
        List<int[]> list = new ArrayList<>();
        for (int h = 3; h <= total / h; h++) {
            if (total % h == 0) {
                int w = total / h;
                if (w >= h) {
                    list.add(new int[]{w, h});
                }
            }
        }

        // 3. 노란색 타일의 개수 검증하기
        for (int[] arr : list) {
            int w = arr[0];
            int h = arr[1];

            if ((w - 2) * (h - 2) == yellow) {
                return arr;
            }
        }

        return null;
    }
}