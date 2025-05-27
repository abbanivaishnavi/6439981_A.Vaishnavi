import java.util.ArrayList;
import java.util.Scanner;

public class que24_ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many student names do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            String name = sc.nextLine();
            studentNames.add(name);
        }

        System.out.println("\nStudent Names Entered:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        sc.close();
    }
}
