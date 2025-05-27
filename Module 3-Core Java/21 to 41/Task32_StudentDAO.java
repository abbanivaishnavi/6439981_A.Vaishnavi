import java.sql.*;

public class que32_StudentDAO {
    private static final String URL = "jdbc:sqlite:students.db";

    public void insertStudent(int id, String name, int age) {
        String sql = "INSERT INTO students(id, name, age) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.executeUpdate();
            System.out.println("Student inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudentAge(int id, int newAge) {
        String sql = "UPDATE students SET age = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, newAge);
            pstmt.setInt(2, id);
            int rows = pstmt.executeUpdate();
            System.out.println("Updated rows: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


