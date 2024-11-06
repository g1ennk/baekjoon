import java.util.*;

import java.util.*;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        initGame(map, participant);
        finishGame(map, completion);
        return getUnfinishedParticipant(map);
    }

    private static void initGame(Map<String, Integer> map, String[] participant) {
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
    }

    private static void finishGame(Map<String, Integer> map, String[] completion) {
        for (String player : completion) {
            map.put(player, map.getOrDefault(player, 0) - 1);
            if (map.get(player) == 0) {
                map.remove(player);
            }
        }
    }

    private static String getUnfinishedParticipant(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        return null;
    }
}