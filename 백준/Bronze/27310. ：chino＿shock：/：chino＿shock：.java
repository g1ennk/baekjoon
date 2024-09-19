import java.util.Scanner;

// :chino_shock:
public class Main {
    static final int COLON = 2;
    static final int CHINO = 6;
    static final char UNDER_BAR = '_';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 이모지 입력받기
        String emoji = sc.nextLine();

        // 2. 입력 난이도 계산하기
        int inputLevel = calculateInputLevel(emoji);

        // 3. 출력하기
        System.out.println(inputLevel);

        sc.close();
    }

    static int calculateInputLevel(String emoji) {
        int numberOfUnderBar = 0;

        // 언더바 개수 세기
        for (int i = CHINO - 1; i < emoji.length(); i++) {
            if (emoji.charAt(i) == UNDER_BAR) {
                numberOfUnderBar++;
            }
        }

        return emoji.length() + COLON + numberOfUnderBar * 5;
    }
}
