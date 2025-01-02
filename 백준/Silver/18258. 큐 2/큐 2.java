// package algorithm_lecture.queue;

import java.io.*;
import java.util.*;

public class Main {

    private static int[] queue;
    private static int rear;
    private static int front;
    private static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 1. 명렁어의 개수 입력받기
        int N = Integer.parseInt(br.readLine());

        // 2. 큐 초기화
        initQueue(N);

        // 3. 명령어 실행
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append("\n");
                    break;

                case "size":
                    sb.append(size()).append("\n");
                    break;

                case "empty":
                    sb.append(empty()).append("\n");
                    break;

                case "front":
                    sb.append(front()).append("\n");
                    break;

                case "back":
                    sb.append(back()).append("\n");
            }
        }

        // 4. 결과 출력
        bw.write(sb.toString());
        bw.flush();
    }

    public static void initQueue(int capacity) {
        queue = new int[capacity];
        rear = 0;
        front = 0;
        size = 0;
    }

    public static int empty() {
        return isEmpty() ? 1 : 0;
    }

    public static void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        queue[rear++] = value;
        size++;
    }

    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int value = queue[front++];
        size--;
        return value;
    }

    public static int size() {
        return size;
    }

    public static int front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }

    public static int back() {
        if (isEmpty()) {
            return -1;
        }
        return queue[rear - 1];
    }

    private static boolean isEmpty() {
        return size == 0;
    }

    private static boolean isFull() {
        return size == queue.length;
    }

}
