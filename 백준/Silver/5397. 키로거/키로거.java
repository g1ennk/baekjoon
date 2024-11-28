// package algorithm_lecture.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

// 키로거
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 개수 입력
        int t = Integer.parseInt(br.readLine());

        // 비밀번호 입력
        for (int i = 0; i < t; i++) {
            // 리스트 초기화
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> iterator = list.listIterator();

            // 비밀번호 입력 후 처리
            String password = br.readLine();
            for (Character c : password.toCharArray()) {
                switch (c) {
                    case '-':
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                            iterator.remove();
                        }
                        break;
                    case '<':
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        break;
                    case '>':
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        break;
                    default:
                        iterator.add(c);
                }
            }

            // 완성된 비밀번호를 결과에 기록
            for (Character c : list) {
                sb.append(c);
            }
            sb.append("\n");
        }

        // 최종 결과 출력
        System.out.println(sb);
    }
}
