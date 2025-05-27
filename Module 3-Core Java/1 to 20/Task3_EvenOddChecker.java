import java.util.Scanner;

public class que3_EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for an integer
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Check if number is even or odd using modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        sc.close();
    }
}
