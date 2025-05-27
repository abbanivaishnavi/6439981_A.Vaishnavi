import java.sql.*;

public class que33_TransactionExample {
    private static final String URL = "jdbc:sqlite:bank.db";

    public void transferMoney(int fromId, int toId, double amount) {
        String debitSql = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String creditSql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL)) {
            conn.setAutoCommit(false);

            try (PreparedStatement debitStmt = conn.prepareStatement(debitSql);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSql)) {

                // Debit
                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromId);
                debitStmt.executeUpdate();

                // Credit
                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toId);
                creditStmt.executeUpdate();

                // Commit transaction
                conn.commit();
                System.out.println("Transaction successful.");
            } catch (Exception e) {
                conn.rollback();
                System.out.println("Transaction failed. Rolled back.");
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        que33_TransactionExample tx = new que33_TransactionExample();
        tx.transferMoney(1, 2, 200.00);
    }
}
