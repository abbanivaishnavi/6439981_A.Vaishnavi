import java.util.Scanner;

public class que15_StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        // Method 1: Using a loop
        String reversed1 = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed1 += input.charAt(i);
        }
        System.out.println("Reversed string (using loop): " + reversed1);

        // Method 2: Using StringBuilder
        String reversed2 = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string (using StringBuilder): " + reversed2);

        sc.close();
    }
}
