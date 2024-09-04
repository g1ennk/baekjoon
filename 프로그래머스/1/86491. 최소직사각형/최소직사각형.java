class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            // 세로가 가로보다 크다면 swap
            if(sizes[i][0] < sizes[i][1]) {
                swap(sizes[i]);
            }
            
            // 가로 및 길이 최댓값 찾기
            if(sizes[i][0] > maxWidth) {
                maxWidth = sizes[i][0];
            }
            if(sizes[i][1] > maxHeight) {
                maxHeight = sizes[i][1];
            }
        }
        
        return maxWidth * maxHeight;
    }
    
    public void swap (int[] sizes) {
        int temp = sizes[0];
        sizes[0] = sizes[1];
        sizes[1] = temp;
    }
}