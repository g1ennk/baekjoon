class Solution {
    public int solution(String my_string) {
        String[] parts = my_string.split(" ");
        
        int result = Integer.parseInt(parts[0]);
        
        for(int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            int nextNumber = Integer.parseInt(parts[i + 1]);
            
            if(operator.equals("+")) {
                result += nextNumber;
            } else if (operator.equals("-")) {
                result -= nextNumber;
            }
        }
        
        return result;
    }
}