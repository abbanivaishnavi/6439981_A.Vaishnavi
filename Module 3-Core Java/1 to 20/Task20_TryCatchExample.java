import java.util.Scanner;

public class que20_TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt user for two integers
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            // Attempt division
            int result = numerator / denominator;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch division by zero error
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            sc.close();
        }
    }
}
