import java.util.Scanner;

public class que14_ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create an array to hold the elements
        int[] numbers = new int[n];
        int sum = 0;

        // Read elements into the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        // Calculate average
        double average = (double) sum / n;

        // Display sum and average
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);

        sc.close();
    }
}
