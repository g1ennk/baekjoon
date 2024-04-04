import java.util.Scanner;

public class Main {
    static final int MAX_SIZE = 14;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read upMeter, downMeter, height
        int upMeter = scanner.nextInt();
        int downMeter = scanner.nextInt();
        int height = scanner.nextInt();

        int dayCount = (int) Math.ceil((double) (height - upMeter) / (upMeter - downMeter)) + 1;

        System.out.println(dayCount);
    }
}
