// Base class
class Animal {
    // Method in base class
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass that inherits from Animal
class Dog extends Animal {
    // Override the makeSound method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class que18_InheritanceDemo {
    public static void main(String[] args) {
        // Instantiate Animal object
        Animal animal = new Animal();
        animal.makeSound();  // Output: Animal makes a sound

        // Instantiate Dog object
        Dog dog = new Dog();
        dog.makeSound();     // Output: Bark
    }
}
