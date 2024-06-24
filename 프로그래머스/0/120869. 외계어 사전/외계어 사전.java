class Solution {
    public int solution(String[] spell, String[] dic) {
        int result = 2;
        
        // dic 배열의 각 문자열을 반복
        for(String dicStr : dic) {
            boolean allContained = true;
            
            // spell 배열의 각 문자열을 반복
            for(String spellStr : spell) {
                if(!dicStr.contains(spellStr)) {
                    allContained = false;
                    break;
                }
            }
            
            if(allContained) {
                result = 1;
                break;
            }
        }
        
        return result;
    }
}