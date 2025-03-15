package animals;

/**
 * Dog.java - Represents a dog in our animal hierarchy
 */
public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age); // Call parent constructor
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    // Polymorphism - overriding parent method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }
    
    // Dog-specific method
    public void wagTail() {
        System.out.println(getName() + " is wagging its tail!");
    }
} 