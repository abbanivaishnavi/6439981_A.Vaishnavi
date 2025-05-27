import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class que27_LambdaSortExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Add some strings to the list
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Sort the list using a lambda expression (alphabetical order)
        Collections.sort(fruits, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
