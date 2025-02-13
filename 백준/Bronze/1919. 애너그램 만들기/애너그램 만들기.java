// package algorithm_lecture.array;

import java.util.Scanner;

// 애너그램 만들기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 두 개의 문자열 입력
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // 2. 계산
        int result = countRemoves(str1, str2);

        // 3. 출력
        System.out.println(result);

        sc.close();
    }

    static int countRemoves(String str1, String str2) {
        int[] alphabets = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            alphabets[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            alphabets[str2.charAt(i) - 'a']--;
        }

        int count = 0;
        for (int i = 0; i < alphabets.length; i++) {
            count += Math.abs(alphabets[i]);
        }

        return count;
    }
}
