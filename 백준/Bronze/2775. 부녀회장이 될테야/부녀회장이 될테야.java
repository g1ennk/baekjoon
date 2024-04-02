import java.util.Scanner;

public class Main {
    static final int MAX_SIZE = 14;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of test cases
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            // Get floor and room number for each test case
            int floor = scanner.nextInt() + 1;
            int roomNumber = scanner.nextInt();

            // Calculate the number of residents
            int numberOfResidents = calculateResidents(floor, roomNumber);

            // Print the result
            System.out.println(numberOfResidents);
        }

        scanner.close();
    }

    private static int calculateResidents(int floor, int roomNumber) {
        // Initialize array to store residents count
        int[][] residents = new int[floor][MAX_SIZE];

        // Fill the residents array
        for (int i = 0; i < MAX_SIZE; i++) {
            residents[0][i] = i + 1; // Fill 0th floor
        }

        // Fill remaining floors
        for (int i = 1; i < floor; i++) {
            for (int j = 0; j < MAX_SIZE; j++) {
                int sum = 0;
                // Calculate the sum of residents from 0th floor to current floor
                for (int k = 0; k <= j; k++) {
                    sum += residents[i - 1][k];
                }
                residents[i][j] = sum; // Store the sum for current floor and room number
            }
        }
        return residents[floor - 1][roomNumber - 1]; // Return the number of residents for given floor and room number
    }
}
