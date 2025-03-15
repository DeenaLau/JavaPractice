package animals;

/**
 * Cat.java - Represents a cat in our animal hierarchy
 */
public class Cat extends Animal {
    private boolean isIndoor;
    
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    
    public boolean isIndoor() {
        return isIndoor;
    }
    
    // Polymorphism - overriding parent method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow! Meow!");
    }
    
    // Cat-specific method
    public void purr() {
        System.out.println(getName() + " is purring...");
    }
} 