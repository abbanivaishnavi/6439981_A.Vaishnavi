import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class que31_JdbcSQLiteExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";  // Path to your SQLite DB file

        try {
            // Load the JDBC driver (optional for modern Java)
            Class.forName("org.sqlite.JDBC");

            // Establish the connection
            Connection conn = DriverManager.getConnection(url);

            // Create a statement and execute a SELECT query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Print the result
            System.out.println("ID | Name    | Age");
            System.out.println("-------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.printf("%d  | %-7s | %d%n", id, name, age);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
