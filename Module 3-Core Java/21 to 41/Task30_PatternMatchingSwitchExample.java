public class que30_PatternMatchingSwitchExample {

    public static void checkObjectType(Object obj) {
        // Switch expression with pattern matching
        String result = switch (obj) {
            case Integer i -> "It's an Integer with value " + i;
            case String s -> "It's a String: \"" + s + "\"";
            case Double d -> "It's a Double: " + d;
            case null -> "It's null";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };

        System.out.println(result);
    }

    public static void main(String[] args) {
        checkObjectType(42);
        checkObjectType("Hello");
        checkObjectType(3.14);
        checkObjectType(true);
        checkObjectType(null);
    }
}
