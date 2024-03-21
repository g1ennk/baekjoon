import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of test cases
        int numberOfCases = scanner.nextInt();
        scanner.nextLine();

        // Iterate over each test case
        for (int i = 0; i < numberOfCases; i++) {
            String str = scanner.nextLine();

            int result = calculateScore(str);
            System.out.println(result);
        }

        scanner.close();
    }

    // Calculate the score based on 'O's in the string
    public static int calculateScore(String str) {
        int score = 0; // Total score
        int combo = 0; // Current consecutive 'O's count

        // Iterate over the characters in the string
        for (char c : str.toCharArray()) {
            if (c == 'O') {
                combo++;
                score += combo;
            } else {
                combo = 0; // Reset combo if 'O' is not encountered
            }
        }

        return score;
    }
}