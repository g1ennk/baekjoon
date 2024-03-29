import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = new int[3];

        while (true) {
            // 1. Input the lengths of the sides of the triangle
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            arr[2] = scanner.nextInt();

            // 2. Check the size
            Arrays.sort(arr);
            int sideA = arr[0];
            int sideB = arr[1];
            int sideC = arr[2];

            // 2. Check if the sides form a right-angled triangle
            if (sideA == 0 && sideB == 0 && sideC == 0) {
                // If all sides are zero, exit the loop
                break;
            } else {
                checkRightAngleTriangle(sideA, sideB, sideC);
            }
        }
    }
    private static void checkRightAngleTriangle(int sideA, int sideB, int sideC) {
        if ((sideA * sideA) + (sideB * sideB) == (sideC * sideC)) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}
