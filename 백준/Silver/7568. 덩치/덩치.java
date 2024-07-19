import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // Define the Person class
    static class Person {
        int weight;
        int height;
        int rank;

        Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
            this.rank = 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of people from user input
        int count = Integer.parseInt(br.readLine());
        List<Person> people = new ArrayList<>();

        // Read the weight and height of each person and add to the list
        for (int i = 0; i < count; i++) {
            String[] info = br.readLine().split(" ");
            int weight = Integer.parseInt(info[0]);
            int height = Integer.parseInt(info[1]);
            people.add(new Person(weight, height));
        }

        // Calculate ranks
        for (int i = 0; i < count; i++) {
            Person current = people.get(i);

            // Compare current person with all other people
            for (int j = 0; j < count; j++) {
                if (i != j) { // Avoid comparing the person to themselves
                    Person other = people.get(j);
                    // Increment the rank of the current person if the other person is both heavier and taller
                    if (other.weight > current.weight && other.height > current.height) {
                        current.rank++;
                    }
                }
            }
        }

        // Output the ranks of all people
        for (Person person : people) {
            System.out.print(person.rank + " ");
        }
    }
}
