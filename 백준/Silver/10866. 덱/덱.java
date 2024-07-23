import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. Read count
        int count = Integer.parseInt(br.readLine());
        
        // 2. Execute
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < count; i++) {
            String command = br.readLine();
            switch(command.split(" ")[0]) {
                case "push_front":
                    int frontNumber = Integer.parseInt(command.split(" ")[1]);
                    queue.addFirst(frontNumber);
                    break;
                case "push_back":
                    int backNumber = Integer.parseInt(command.split(" ")[1]);
                    queue.addLast(backNumber);
                    break;
                case "pop_front":
                    Integer frontPop = queue.pollFirst();
                    System.out.println((frontPop == null) ? -1 : frontPop);
                    break;
                case "pop_back":
                    Integer backPop = queue.pollLast();
                    System.out.println((backPop == null) ? -1 : backPop);
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println((queue.isEmpty()) ? 1 : 0);
                    break;
                case "front":
                    Integer front = queue.peekFirst();
                    System.out.println((front == null) ? -1 : front);
                    break;
                case "back":
                    Integer back = queue.peekLast();
                    System.out.println((back == null) ? -1 : back);
                    break;
            }
        }
    }
}