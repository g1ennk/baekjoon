import java.util.*;

class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zeroDeleted = 0;

        while (!s.equals("1")) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeroDeleted++;
                    continue;
                }
                sb.append(c);
            }
            s = Integer.toBinaryString(sb.length());
            count++;
        }

        answer[0] = count;
        answer[1] = zeroDeleted;
        return answer;
    }
}