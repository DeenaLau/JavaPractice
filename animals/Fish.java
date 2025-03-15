package animals;

/**
 * Fish.java - Represents a fish in our animal hierarchy
 */
public class Fish extends Animal implements Swimmer {
    private String waterType; // "freshwater" or "saltwater"
    
    public Fish(String name, int age, String waterType) {
        super(name, age);
        this.waterType = waterType;
    }
    
    public String getWaterType() {
        return waterType;
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " makes bubbling sounds.");
    }
    
    // Implementing the interface method
    @Override
    public void swim() {
        System.out.println(getName() + " is swimming in " + waterType + " water.");
    }
}