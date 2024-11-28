// package algorithm_lecture.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 초기 문자열 입력
        String initialString = br.readLine();
        int commandCount = Integer.parseInt(br.readLine());

        // LinkedList에 초기 문자열 삽입
        LinkedList<Character> list = new LinkedList<>();
        for (char c : initialString.toCharArray()) {
            list.add(c);
        }

        // ListIterator 생성
        ListIterator<Character> iterator = list.listIterator(list.size());

        // 3. 명령어 처리
        for (int i = 0; i < commandCount; i++) {
            String command = br.readLine();
            char commandType = command.charAt(0);

            switch (commandType) {
                case 'L':
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    break;
                case 'D':
                    if (iterator.hasNext()) {
                        iterator.next();
                    }
                    break;
                case 'B':
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                case 'P':
                    char data = command.charAt(2);
                    iterator.add(data);
                    break;
            }
        }

        // 4. 출력
        for (Character c : list) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
