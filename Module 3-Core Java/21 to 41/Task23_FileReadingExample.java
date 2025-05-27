import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class que23_FileReadingExample {
    public static void main(String[] args) {
        String fileName = "output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            System.out.println("Contents of " + fileName + ":");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
