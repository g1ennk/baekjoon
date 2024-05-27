class Solution {
    public int[] solution(int[] numbers, String direction) {
        switch(direction) {
            case "right":
                // 오른쪽 회전
                for(int i = numbers.length - 1; i > 0; i--) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = temp;
                }
                break;
            case "left":
                // 왼쪽 회전
                for(int i = 0; i < numbers.length - 1; i++) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
                break;
        }
        
        return numbers;
    }
}