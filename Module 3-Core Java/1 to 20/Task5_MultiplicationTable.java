import java.util.Scanner;

public class que5_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        // Use a for loop to print the multiplication table up to 10
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}
