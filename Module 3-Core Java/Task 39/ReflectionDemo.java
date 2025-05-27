import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        // Load class dynamically
        Class<?> personClass = Class.forName("Person");

        // Create an instance of the class
        Object personInstance = personClass.getDeclaredConstructor().newInstance();

        // Print all declared methods and their parameter types
        Method[] methods = personClass.getDeclaredMethods();
        System.out.println("Declared methods:");
        for (Method method : methods) {
            System.out.print(method.getName() + "(");
            Class<?>[] paramTypes = method.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                System.out.print(paramTypes[i].getSimpleName());
                if (i < paramTypes.length - 1) System.out.print(", ");
            }
            System.out.println(")");
        }

        // Invoke setName method
        Method setNameMethod = personClass.getDeclaredMethod("setName", String.class);
        setNameMethod.invoke(personInstance, "User");

        // Invoke greet method
        Method greetMethod = personClass.getDeclaredMethod("greet");
        greetMethod.invoke(personInstance);
    }
}
