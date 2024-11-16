// package samsung.problemSolving.basic.day5;

import java.util.*;

// 1221. [S/W 문제해결 기본] 5일차 - GNS D3
public class Solution {
    private static final HashMap<String, Integer> strToInt = new HashMap<>();
    private static final HashMap<Integer, String> intToStr = new HashMap<>();

    static {
        String[] numbers = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
        for (int i = 0; i < numbers.length; i++) {
            strToInt.put(numbers[i], i);
            intToStr.put(i, numbers[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 1. 테스트 케이스 입력 받기
        int numberOfTestCase = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numberOfTestCase; i++) {
            // 2. 테스트 케이스의 번호와 테스트 케이스의 길이 입력 받기
            String line = sc.nextLine();
            String[] token = line.split(" ");
            int testCaseNumber = Integer.parseInt(token[0].substring(1));
            int testCaseLength = Integer.parseInt(token[1]);

            // 3. 테스트 케이스 길이 입력 받기
            String[] strNumbers = new String[testCaseLength];
            for (int j = 0; j < testCaseLength; j++) {
                strNumbers[j] = sc.next();
            }
            sc.nextLine();

            // 4. 결과 출력하기
            System.out.printf("#%d\n%s\n", testCaseNumber, getSortedNumber(strNumbers));
        }


    }

    private static String getSortedNumber(String[] strNumbers) {
        // 1. 정수로 바꾸기
        int[] intNumbers = new int[strNumbers.length];
        for (int i = 0; i < strNumbers.length; i++) {
            intNumbers[i] = strToInt.get(strNumbers[i]);
        }

        // 2. 정렬하기
        Arrays.sort(intNumbers);

        // 3. 다시 문자열로 바꾸기
        for (int i = 0; i < intNumbers.length; i++) {
            strNumbers[i] = intToStr.get(intNumbers[i]);
        }

        // 4. 문자열로 리턴하기
        StringJoiner sj = new StringJoiner(" ");
        for (String strNumber : strNumbers) {
            sj.add(strNumber);
        }

        return sj.toString();
    }

}
