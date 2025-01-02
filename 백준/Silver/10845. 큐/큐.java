// package algorithm_lecture.queue;

import java.io.*;
import java.util.*;

public class Main {

    private static int[] queue;
    private int rear;
    private int front;
    private int size;

    public Main(int capacity) {
        queue = new int[capacity];
        rear = 0;
        front = 0;
        size = 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 1. 명렁어의 개수 입력받기
        int N = Integer.parseInt(br.readLine());

        // 2. 명령어 실행
        Main queue = new Main(N);
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    queue.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(queue.pop()).append("\n");
                    break;

                case "size":
                    sb.append(queue.size()).append("\n");
                    break;

                case "empty":
                    sb.append(queue.empty()).append("\n");
                    break;

                case "front":
                    sb.append(queue.front()).append("\n");
                    break;

                case "back":
                    sb.append(queue.back()).append("\n");
            }
        }

        // 3. 결과 출력
        bw.write(sb.toString());
        bw.flush();
    }

    public int empty() {
        return isEmpty() ? 1 : 0;
    }

    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        queue[rear++] = value;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int value = queue[front++];
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    public int front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }

    public int back() {
        if (isEmpty()) {
            return -1;
        }
        return queue[rear - 1];
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == queue.length;
    }

}
