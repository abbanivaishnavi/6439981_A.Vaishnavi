import java.util.Scanner;

public class que13_RecursiveFibonacci {

    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer n to find nth Fibonacci number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input! Please enter a non-negative number.");
        } else {
            int result = fibonacci(n);
            System.out.println("Fibonacci number at position " + n + " is: " + result);
        }

        sc.close();
    }
}
