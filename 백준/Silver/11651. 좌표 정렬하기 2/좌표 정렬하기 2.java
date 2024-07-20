import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of coordinates
        int count = sc.nextInt();

        // Initialize 2D array for coordinates
        int[][] coordinate = new int[count][2];

        // Read coordinates
        for(int i = 0; i < count; i++) {
            coordinate[i][0] = sc.nextInt(); // x-coordinate
            coordinate[i][1] = sc.nextInt(); // y-coordinate
        }

        // Sort coordinates by y (then x if y is the same)
        sortingInY(coordinate);

        // Print sorted coordinates
        for(int i = 0; i < count; i++) {
            System.out.print(coordinate[i][0] + " " + coordinate[i][1]);
            System.out.println();
        }
    }

    // Sort by y-coordinate, then by x-coordinate if y is the same
    public static void sortingInY(int[][] coordinate) {
        Arrays.sort(coordinate, (a, b) -> {
            if(a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });
    }
}