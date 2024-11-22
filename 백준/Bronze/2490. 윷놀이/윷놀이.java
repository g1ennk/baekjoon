// package algorithm_lecture.basic;

import java.util.Scanner;

// 윷놀이
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int zero = 0;

            for (int j = 0; j < 4; j++) {
                if (sc.nextInt() == 0) {
                    zero++;
                }
            }

            switch (zero) {
                case 0:
                    sb.append("E\n");
                    break;
                case 1:
                    sb.append("A\n");
                    break;
                case 2:
                    sb.append("B\n");
                    break;
                case 3:
                    sb.append("C\n");
                    break;
                case 4:
                    sb.append("D\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
