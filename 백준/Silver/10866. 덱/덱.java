// package algorithm_lecture.deque;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] deque;
    static int front;
    static int rear;
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 명령어의 개수 입력받기
        int N = Integer.parseInt(br.readLine());

        // 2. 명령어 실행
        init(N);
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    pushFront(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    pushBack(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    bw.write(popFront() + "\n");
                    break;
                case "pop_back":
                    bw.write(popBack() + "\n");
                    break;
                case "size":
                    bw.write(size + "\n");
                    break;
                case "empty":
                    bw.write(empty() + "\n");
                    break;
                case "front":
                    bw.write(front() + "\n");
                    break;
                case "back":
                    bw.write(back() + "\n");
                    break;
            }
        }

        // 3. 출력
        bw.flush();
    }

    static void init(int capacity) {
        deque = new int[capacity * 2];
        front = capacity;
        rear = capacity;
        size = 0;
    }

    static void pushFront(int value) {
        deque[--front] = value;
        size++;
    }

    static void pushBack(int value) {
        deque[rear++] = value;
        size++;
    }

    static int popFront() {
        if (isEmpty()) return -1;
        size--;
        return deque[front++];
    }

    static int popBack() {
        if (isEmpty()) return -1;
        size--;
        return deque[--rear];
    }

    static int empty() {
        return isEmpty() ? 1 : 0;
    }

    static boolean isEmpty() {
        return size == 0;
    }

    static int front() {
        if (isEmpty()) return -1;
        return deque[front];
    }

    static int back() {
        if (isEmpty()) return -1;
        return deque[rear - 1];
    }
}
