class Solution {
    public int solution(int[][] dots) {
        int rowCount = dots.length;
        int colCount = dots[0].length;
        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;

        
        for(int i = 0; i < rowCount; i++) {
            for(int j = 0; j < colCount; j++) {
                int x = dots[i][0];
                int y = dots[i][1];
                
                if(x > xMax) {
                    xMax = x;
                }
                
                if(x < xMin) {
                    xMin = x;
                }
                
                if(y > yMax) {
                    yMax = y;
                }
                
                if(y < yMin) {
                    yMin = y;
                }
            }
        }
        
        int area = (xMax - xMin) * (yMax - yMin);
        
        return area;
    }
}