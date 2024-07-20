import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read loop count
        int count = sc.nextInt();
        
        // Read x and y
        int[][] coordinates = new int[count][2];
        for(int i = 0; i < count; i++) {
            coordinates[i][0] = sc.nextInt(); // x
            coordinates[i][1] = sc.nextInt(); // y
        }
        
        // Solutions
        // sortUsingSwapping(coordinates, count);
        sortUsingComparator(coordinates);
        
        // Print the result
        for(int i = 0; i < count; i++) {
            System.out.println(coordinates[i][0] + " " + coordinates[i][1]);
        }
        
        sc.close();
    }
    
    // Solution 1: Using swapping
    public static void sortUsingSwapping(int[][] coordinates, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (coordinates[i][0] > coordinates[j][0] || 
                   (coordinates[i][0] == coordinates[j][0] && coordinates[i][1] > coordinates[j][1])) {
                    int tempX = coordinates[i][0];
                    coordinates[i][0] = coordinates[j][0];
                    coordinates[j][0] = tempX;

                    int tempY = coordinates[i][1];
                    coordinates[i][1] = coordinates[j][1];
                    coordinates[j][1] = tempY;
                }
            }
        }
    }
    
    // Solution 2: Using comparator
    public static void sortUsingComparator(int[][] coordinates) {
        Arrays.sort(coordinates, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });
    }
}
