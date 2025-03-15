package animals;

/**
 * Bird.java - Represents a bird in our animal hierarchy
 */
public class Bird extends Animal {
    private boolean canFly;
    
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }
    
    public boolean canFly() {
        return canFly;
    }
    
    // Polymorphism - overriding parent method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Tweet! Tweet!");
    }
    
    // Bird-specific method
    public void fly() {
        if (canFly) {
            System.out.println(getName() + " is flying high in the sky!");
        } else {
            System.out.println(getName() + " cannot fly.");
        }
    }
} 