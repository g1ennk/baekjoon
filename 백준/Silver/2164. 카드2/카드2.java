import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(getLastCard(n));
    }
    
    public static int getLastCard(int n) {
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        
        // Put cards
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }
        
        while(queue.size() != 1) {
            // 1. Discard the top card
            queue.poll();
            
            // 2. Put the next top card into the bottom
            queue.addLast(queue.poll());
        }
        
        return queue.poll();
    }
}

