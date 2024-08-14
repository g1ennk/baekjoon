class Solution {
    public int solution(int[][] sizes) {
        // 1. x가 y중 작은 값을 앞으로 스왑
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                swap(sizes[i]);
            }
        }
        
        // 2. 하나씩 돌면서 x중 가장 큰 값과 y중 가장 큰 값을 찾기
        int maxWidth = sizes[0][0];
        int maxHeight = sizes[0][1];
        for(int i = 1; i < sizes.length; i++) {
            if(sizes[i][0] > maxWidth) {
                maxWidth = sizes[i][0];
            }
            
            if(sizes[i][1] > maxHeight) {
                maxHeight = sizes[i][1];
            }
        }
        
        // 3. 그 둘을 곱해서 반환
        return maxWidth * maxHeight;
    }
    
    public static void swap(int[] xY) {
        int temp = xY[0];
        xY[0] = xY[1];
        xY[1] = temp;
    }
}