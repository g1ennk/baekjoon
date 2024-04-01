import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the number of cards and the standard value
        int cardCount = scanner.nextInt();
        int standardValue = scanner.nextInt();

        // 2. Read all the cards
        int[] cardValues = new int[cardCount];
        for (int i = 0; i < cardCount; i++) {
            cardValues[i] = scanner.nextInt();
        }

        // 3. Search
        int result = findClosestSum(cardValues, standardValue);

        // 4. Print the result
        System.out.println(result);
    }

    private static int findClosestSum(int[] cardValues, int standard) {
        int minDifference = Integer.MAX_VALUE;
        int closestSum = cardValues[0] + cardValues[1] + cardValues[2];

        for (int i = 0; i < cardValues.length; i++) {
            for (int j = i + 1; j < cardValues.length; j++) {
                for (int k = j + 1; k < cardValues.length; k++) {
                    int sum = cardValues[i] + cardValues[j] + cardValues[k];
                    if (sum <= standard) {
                        int difference = Math.abs(sum - standard);
                        if (difference == 0) {
                            return sum;
                        } else {
                            if (difference < minDifference) {
                                minDifference = difference;
                                closestSum = sum;
                            }
                        }
                    }
                }
            }
        }
        return closestSum;
    }
}
