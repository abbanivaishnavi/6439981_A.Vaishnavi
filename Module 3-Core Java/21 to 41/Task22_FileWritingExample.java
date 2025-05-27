import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class que22_FileWritingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to write to file: ");
        String input = sc.nextLine();

        try {
            // Create FileWriter object to write to output.txt
            FileWriter writer = new FileWriter("output.txt");

            // Write the input string to the file
            writer.write(input);

            // Close the writer to save changes
            writer.close();

            System.out.println("Data has been written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        sc.close();
    }
}
