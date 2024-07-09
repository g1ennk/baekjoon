
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // 반복 횟수 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int reps = Integer.parseInt(br.readLine());
        String[] answers = new String[reps];

        // 반복 횟수만큼 문장에 있는 단어 뒤집기
        for (int i = 0; i < reps; i++) {
            answers[i] = reverseWords(br.readLine());
        }

        // 출력
        for (String str : answers) {
            System.out.println(str);
        }

    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");


        /* Stack 활용한 뒤집기
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            Stack<Character> stack = new Stack<>();
            for(char ch : word.toCharArray()) {
                stack.push(ch);
            }

            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            sb.append(" ");
        } */

        // StringBuilder 활용한 뒤집기
        StringJoiner sj = new StringJoiner(" ");
        for(String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            wordBuilder.reverse();
            sj.add(wordBuilder.toString());
        }
        
        return sj.toString();
    }
}