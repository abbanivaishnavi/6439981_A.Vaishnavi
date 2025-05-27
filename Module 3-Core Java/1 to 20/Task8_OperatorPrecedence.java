public class que8_OperatorPrecedence {
    public static void main(String[] args) {
        // Expression 1
        int result1 = 10 + 5 * 2;
        // Explanation: Multiplication (*) has higher precedence than addition (+)
        // So: 5 * 2 = 10 → then 10 + 10 = 20
        System.out.println("Result of 10 + 5 * 2 = " + result1); // Output: 20

        // Expression 2
        int result2 = (10 + 5) * 2;
        // Parentheses () change the precedence
        // So: (10 + 5) = 15 → then 15 * 2 = 30
        System.out.println("Result of (10 + 5) * 2 = " + result2); // Output: 30

        // Expression 3
        int result3 = 100 / 5 + 2 * 3;
        // Division (/) and multiplication (*) have same precedence, evaluated left to right
        // So: 100 / 5 = 20 → 2 * 3 = 6 → then 20 + 6 = 26
        System.out.println("Result of 100 / 5 + 2 * 3 = " + result3); // Output: 26

        // Expression 4
        int result4 = 100 / (5 + 5) * 3;
        // Parentheses change precedence: (5 + 5) = 10 → 100 / 10 = 10 → 10 * 3 = 30
        System.out.println("Result of 100 / (5 + 5) * 3 = " + result4); // Output: 30
    }
}
