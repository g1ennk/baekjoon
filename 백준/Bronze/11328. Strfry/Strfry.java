// package algorithm_lecture.array;

import java.util.Arrays;
import java.util.Scanner;

// Strfry
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 테스트 케이스 수 입력받기

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            answer.append(strfry1(str1, str2)).append("\n");
        }

        System.out.println(answer);

        sc.close();
    }

    static String strfry(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return (Arrays.equals(arr1, arr2)) ? "Possible" : "Impossible";
    }

    static String strfry1(String str1, String str2) {
        int[] alphabet = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            alphabet[c - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            alphabet[c - 'a']--;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                return "Impossible";
            }
        }

        return "Possible";
    }
}
