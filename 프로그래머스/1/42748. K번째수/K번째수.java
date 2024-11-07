import java.util.*;

class Solution {
    public static int[] solution (int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int startIdx = commands[i][0] - 1;
            int endIdx = commands[i][1];
            int targetIdx = commands[i][2] - 1;

            // 1. 자른다.
            int[] slice = Arrays.copyOfRange(array, startIdx, endIdx);

            // 2. 정렬한다.
            Arrays.sort(slice);

            // 3. 해당 숫자를 반환한다.
            result[i] = slice[targetIdx];
        }

        return result;
    }
}