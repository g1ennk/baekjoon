import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 학생 수와 멀티탭 수 입력받기
        int numberOfPerson = sc.nextInt();
        int numberOfoutlet = sc.nextInt();

        // 2. 멀티탭 개수 입력받기
        int total = 0;
        for (int i = 0; i < numberOfoutlet; i++) {
            int outlet = sc.nextInt();
            if (outlet % 2 == 0) {
                total += outlet / 2;
            } else {
                total += outlet / 2 + 1;
            }
        }

        // 3. 결과 출력하기
        System.out.println((total >= numberOfPerson) ? "YES" : "NO");

        sc.close();
    }
}


