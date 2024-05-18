// 1. import
import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        
        // 2. 초기화
        ArrayList<Integer> list = new ArrayList<>();
        
        // 3. 루프를 돌며 배수 찾아 list에 넣기
        for(int number : numlist) {
            if(number % n == 0) {
                list.add(number);
            }
        }
        
        // 4. list를 array로 변환하기
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}