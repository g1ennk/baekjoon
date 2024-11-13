// package samsung;

import java.util.Scanner;

// 1209. [S/W 문제해결 기본] 2일차 - Sum
public class Solution {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int[][] arr = new int[100][100];
            sc.nextInt();
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            System.out.printf("#%d %d\n", i, getSum(arr));
        }
        
        sc.close();
    }

    public static int getSum(int[][] array) {
        int maxSum = 0;
        int thirdSum = 0;
        int fourthSum = 0;
        
        for (int i = 0; i < array.length; i++) {
            int firstSum = 0;
            int secondSum = 0;

            for (int j = 0; j < array.length; j++) {
                firstSum += array[i][j];
                secondSum += array[j][i];
            }
            maxSum = Math.max(maxSum, Math.max(firstSum, secondSum));

            thirdSum += array[i][i];
            fourthSum += array[i][array.length - 1 - i];
        }
        maxSum = Math.max(maxSum, Math.max(thirdSum, fourthSum));
        
        return maxSum;
    }
}
