import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 몇 번 반복할건지
        int testCase = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리
        
        // 실행
        for (int i = 0; i < testCase; i++) {
           String input = scanner.nextLine();
           processTestCase(input);
        }
        scanner.close();
    }

    public static void processTestCase(String input) {
        String[] tokens = input.split(" ");
        int repeat = Integer.parseInt(tokens[0]);
        String str = tokens[1];

        repeatAndPrint(repeat, str);
    }

    public static void repeatAndPrint(int repeat, String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < repeat; j++) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
}
