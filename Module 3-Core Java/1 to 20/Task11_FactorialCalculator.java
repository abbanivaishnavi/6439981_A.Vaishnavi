import java.util.Scanner;

public class que11_FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Invalid input! Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;

            // Calculate factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}
