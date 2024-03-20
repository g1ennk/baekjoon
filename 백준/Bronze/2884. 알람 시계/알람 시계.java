import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        // 알람 설정
        int[] alarmTime = calculateAlarmTime(hour, minute);

        // 출력
        System.out.println(alarmTime[0] + " " + alarmTime[1]);
    }
    public static int[] calculateAlarmTime(int hour, int minute) {
        // 1. 45분을 그냥 뺀다.
        minute -= 45;

        // 2. 분이 음수가 되면 시간에서 1을 빼고 분을 조정한다.
        if (minute < 0) {
            hour -= 1;
            minute += 60;
        }

        // 3. 시간이 음수가 되면 24를 더한다.
        if (hour < 0) {
            hour += 24;
        }

        return new int[]{hour,minute};
    }
}
