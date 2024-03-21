import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the score
        int score = scanner.nextInt();

        // 2. Calculate the grade
        char grade = calculateGrade(score);

        // 3. Print the result
        System.out.println(grade);

        scanner.close();

    }
    public static char calculateGrade(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 60 && score < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
