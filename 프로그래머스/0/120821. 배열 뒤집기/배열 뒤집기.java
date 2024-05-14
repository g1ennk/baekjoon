class Solution {
    public int[] solution(int[] num_list) {
        // 초기화
        int start = 0;
        int end = num_list.length - 1;
        
        // 교환
        for(int i = 0; i < num_list.length / 2; i++, start++, end--) {
            int temp = num_list[start];
            num_list[start] = num_list[end];
            num_list[end] = temp;
        }
        
        return num_list;
    }
}