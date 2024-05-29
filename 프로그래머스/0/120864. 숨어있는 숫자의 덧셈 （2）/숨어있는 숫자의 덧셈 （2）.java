class Solution {
    public int solution(String my_string) {
        int sum = 0;
        
        String[] numbers = my_string.split("[a-zA-Z]+");
        
        for(String number : numbers) {
            if(!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }
        
        return sum;
    }
}