import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read total number of people and step count
        int total = sc.nextInt();
        int times = sc.nextInt();
        
        // Print the result
        System.out.println(josephus(total, times));
    }
    
    public static String josephus(int total, int times) {
        Queue <Integer> queue = new ArrayDeque<>();
        // Add all people to the queue
        for(int i = 1; i <= total; i++) {
            queue.add(i);
        }
        
        // List to store the result sequence
        List<Integer> result = new LinkedList<>();
        while(!queue.isEmpty()) {
            for(int i = 0; i < times - 1; i++) {
                queue.add(queue.poll());
            }
            result.add(queue.poll());
        }
        
        // Create a StringJoiner to format the result
        StringJoiner sj = new StringJoiner(", ");
        for(int number : result) {
            sj.add(Integer.toString(number));
        }

        return "<" + sj.toString() + ">";
    }
}
