
import java.util.Scanner;

// 1546: 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//
//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//
//세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 점수의 개수 n 입력받기
        int n = scanner.nextInt();

        // 2. n만큼 반복하며 입력 받은 숫자를 배열에 추가하기
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. 해당 배열을 돌면서 최댓값 구하기
        double maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }

        // 4. 모든 배열 값 수정
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double) arr[i] * 100 / maxNum;
            sum += arr[i];
        }

        // 5. 새로운 평균값 구하기
        double average = (double) sum / n;

        // 6. 출력하기
        System.out.println(average);
    }
}
