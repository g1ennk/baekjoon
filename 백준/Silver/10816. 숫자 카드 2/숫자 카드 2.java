import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> cardCountMap = new HashMap<>();

        // Read the number of cards Sanggeun has
        int numCards = sc.nextInt();
        for (int i = 0; i < numCards; i++) {
            int card = sc.nextInt();
            cardCountMap.put(card, cardCountMap.getOrDefault(card, 0) + 1);
        }

        // Read the number of queries
        int numQueries = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numQueries; i++) {
            int query = sc.nextInt();
            result.append(cardCountMap.getOrDefault(query, 0)).append(" ");
        }

        // Output the results
        System.out.println(result.toString().trim());
    }
}
