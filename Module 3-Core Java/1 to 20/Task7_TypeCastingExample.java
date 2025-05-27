public class que7_TypeCastingExample {
    public static void main(String[] args) {
        // Declare a double variable with a decimal value
        double myDouble = 9.75;

        // Cast double to int (narrowing conversion)
        int myIntFromDouble = (int) myDouble;

        // Display the result
        System.out.println("Original double value: " + myDouble);
        System.out.println("After casting to int: " + myIntFromDouble);

        // Declare an int variable
        int myInt = 42;

        // Cast int to double (widening conversion)
        double myDoubleFromInt = (double) myInt;

        // Display the result
        System.out.println("Original int value: " + myInt);
        System.out.println("After casting to double: " + myDoubleFromInt);
    }
}
