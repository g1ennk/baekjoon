class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        int[] result = {0, 0};
        
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        
        for(String keyInput : keyinput) {
            if(keyInput.equals("right")) {
                if(x + 1 <= xLimit) {
                    x++;
                }
            }
            
            if(keyInput.equals("left")) {
                if(x - 1 >= -xLimit) {
                    x--;
                }
            }
            
            if(keyInput.equals("up")) {
                if(y + 1 <= yLimit) {
                    y++;
                } 
            }
            
            if(keyInput.equals("down")) {
                if(y - 1 >= -yLimit) {
                    y--;
                }
            }
        }
        
        result[0] = x;
        result[1] = y;
        
        return result;
    }
}