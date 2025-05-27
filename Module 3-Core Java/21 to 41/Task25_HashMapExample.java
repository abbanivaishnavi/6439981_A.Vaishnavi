import java.util.HashMap;
import java.util.Scanner;

public class que25_HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many student entries do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student ID (integer): ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            studentMap.put(id, name);
        }

        System.out.print("\nEnter a student ID to retrieve the name: ");
        int searchId = sc.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student name: " + studentMap.get(searchId));
        } else {
            System.out.println("No student found with ID " + searchId);
        }

        sc.close();
    }
}
