import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 배열의 크기 입력받기
        int count = sc.nextInt();
        
        // 배열 요소 입력 받기
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 결과 출력
        System.out.println(solution(arr));

    }
    
    public static int solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        // 배열을 순회하며 스택에 추가, 0인 경우 제거
        for(int command : arr) {
            if(command == 0) {
                stack.pop();
            } else {
                stack.push(command);
            }
        }
        
        // 남은 스택의 요소들의 합 계산
        int total = 0;
        while(!stack.isEmpty()) {
            total += stack.pop();
        }
        
        return total;
    }
}