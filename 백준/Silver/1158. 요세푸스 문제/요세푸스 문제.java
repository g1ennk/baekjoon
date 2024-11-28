// package algorithm_lecture.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringJoiner sj = new StringJoiner(", ");
        StringBuilder sb = new StringBuilder();

        // 입력 받기
        int N = sc.nextInt(); // 총 사람 수
        int K = sc.nextInt(); // 제거 간격

        // 사람들을 리스트에 추가
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        // 요세푸스 순열을 저장할 리스트
        List<Integer> result = new LinkedList<>();

        int index = 0; // 현재 인덱스
        while (!list.isEmpty()) {
            index = (index + K - 1) % list.size(); // K번째 사람의 인덱스
            sj.add(list.remove(index).toString()); // 제거된 사람 추가
        }

        // 결과 출력
        sb.append("<").append(sj).append(">");
        System.out.println(sb);
    }
}
