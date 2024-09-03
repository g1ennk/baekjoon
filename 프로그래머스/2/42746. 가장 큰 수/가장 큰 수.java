import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        int N = numbers.length;
        String[] strArr = new String[N];
        
        // 1. 문자 배열로 전환하기
        for(int i = 0; i < N; i++) {
            strArr[i] = String.valueOf(numbers[i]);
        }
        
        // 2. 정렬하기(두 수를 붙이면서 큰 걸 앞으로 정렬)
        Comparator<String> biggerAppend = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                String o1 = s1 + s2;
                String o2 = s2 + s1;
                return o2.compareTo(o1);
            }
        };
        Arrays.sort(strArr, biggerAppend);
        // 예외 처리
        if(strArr[0].equals("0")) {
            return "0";
        }
        
        // 3. 정렬된 문자열 배열을 하나의 문자열로 합치기
        StringBuilder sb = new StringBuilder();
        for(String str : strArr) {
            sb.append(str);
        }
        
        // 4. 리턴
        return sb.toString();
    }
}