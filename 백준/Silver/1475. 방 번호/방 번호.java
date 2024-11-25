// package algorithm_lecture.array;

import java.util.Scanner;

// 방 번호
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roomNumber = sc.nextInt();

        System.out.println(getSets(roomNumber));
    }

    static int getSets(int roomNumber) {
        int[] sets = new int[11];
        int sixNineCount = 0;

        // 빈도 테이블 채우기
        while (roomNumber != 0) {
            int number = roomNumber % 10;
            if (number == 6 || number == 9) sixNineCount++;
            sets[number]++;
            roomNumber /= 10;
        }

        // 6 9 처리
        sets[6] = sets[9] = (sixNineCount + 1) / 2;

        // 최댓값 찾기
        int max = 0;
        for (int i = 0; i < sets.length; i++) {
            if (sets[i] > max) {
                max = sets[i];
            }
        }

        return max;
    }
}
