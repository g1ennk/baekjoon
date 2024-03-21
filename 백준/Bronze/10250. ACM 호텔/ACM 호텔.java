import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input for the number of test cases
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {

            // 1. Get Input
            int totalFloor = scanner.nextInt();
            int totalRoom = scanner.nextInt();
            int guestNumber = scanner.nextInt();

            // 2. Process
            int roomNumber = calculateRoomNumber(totalFloor, guestNumber);

            // 3. Print Output
            System.out.println(roomNumber);
        }
        scanner.close();
    }
    public static int calculateRoomNumber(int totalFloor, int guestNumber) {
        int floor;
        int room;

        if (guestNumber % totalFloor == 0) {
            floor = totalFloor * 100;
            room = guestNumber / totalFloor;
        } else {
            floor = (guestNumber % totalFloor) * 100;
            room = (guestNumber / totalFloor) + 1;
        }

        return floor + room;
    }
}