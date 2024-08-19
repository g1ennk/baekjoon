import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set <Integer> lostSet = new HashSet<>();
        Set <Integer> reserveSet = new HashSet<>();
        
        // 1. 배열을 Set으로 변환하기
        for(int lostStudent : lost) {
            lostSet.add(lostStudent);
        }
        
        for(int reserveStudent : reserve) {
            if (lostSet.contains(reserveStudent)) {
                // 여벌 체육복을 가진 학생이 체육복을 잃어버린 경우
                lostSet.remove(reserveStudent);
            } else {
                reserveSet.add(reserveStudent);
            }
        }
        
        // 2. 여벌의 체육복을 가진 학생을 기준으로 순회
        for (int reserveStudent : reserveSet) {
            int backStudent = reserveStudent - 1;
            int frontStudent = reserveStudent + 1;
            
            if (lostSet.contains(backStudent)) {
                lostSet.remove(backStudent);
            } else if (lostSet.contains(frontStudent)) {
                lostSet.remove(frontStudent);
            }
        }
        
        // 3. 최종적으로 체육 수업을 들을 수 있는 학생 수
        return n - lostSet.size();
    }
}