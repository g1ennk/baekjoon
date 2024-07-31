import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map <String, String> map = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();
        
        // 1. 명령어 처리
        for(String input : record) {
            String[] elements = input.split(" ");
            String command = elements[0];
            String id = elements[1];
            
            switch (command) {
                case "Enter":
                    String nickname = elements[2];
                    map.put(id, nickname);
                    answer.add(id +" 들어왔습니다.");
                    break;
                    
                case "Leave":                    
                    answer.add(id + " 나갔습니다.");
                    break;
                    
                case "Change":
                    String changedNickname = elements[2];
                    map.put(id, changedNickname);
                    break;
            }
        }
        
        // 2. id를 닉네임으로 변경
        String[] finalAnswer = new String[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            String[] logParts = answer.get(i).split(" ");
            String nickname = map.get(logParts[0]);
            String action = logParts[1];
            
            finalAnswer[i] = nickname + "님이 " + action;
        }
                
        return finalAnswer;
    }
}


