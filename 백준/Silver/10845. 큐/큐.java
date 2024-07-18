import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String command = br.readLine();

            switch (command.split(" ")[0]) {
                case "push":
                    int number = Integer.parseInt(command.split(" ")[1]);
                    queue.add(number);
                    break;
                case "pop":
                    System.out.println(queue.isEmpty() ? -1 : queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(queue.isEmpty() ? -1 : queue.getFirst());
                    break;
                case "back":
                    System.out.println(queue.isEmpty() ? -1 : queue.getLast());
                    break;
            }
        }
    }
}
