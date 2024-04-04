import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        int targetRoomNumber = scanner.nextInt();

        // Calculate the minimum number of rooms to pass
        int minimumRoomsPassed = calculateMinimumRooms(targetRoomNumber);

        // Print the result
        System.out.println(minimumRoomsPassed);
    }

    private static int calculateMinimumRooms(int targetRoomNumber) {
        int roomsPassed = 1; 
        int currentRange = 1; 

        while (targetRoomNumber > currentRange) {
            currentRange += 6 * roomsPassed; // Expand the range
            roomsPassed++; // Increment the number of rooms passed
        }

        return roomsPassed;
    }
}
