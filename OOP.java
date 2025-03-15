/**
 * AnimalDemo.java - Demonstrates OOP concepts using animal examples
 */
// Object-Oriented Programming

// class, struct

// class by default is all private
// struct by default is all public

abstract class Animal {
    // Encapsulation - private attributes
    String name;
    int age;
    
    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Abstract method - to be implemented by subclasses
    public abstract void makeSound();
    
    // Regular method
    public void eat() {
        System.out.println(name + " is eating...");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}
// parent class, child class
// Inheritance - Dog inherits from Animal
class Dog extends Animal {
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

// Inheritance - Cat inherits from Animal
class Cat extends Animal {
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

// Inheritance - Bird inherits from Animal
class Bird extends Animal {
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

// Interface example
interface Swimmer {
    void swim();
}

// Class implementing an interface
class Fish extends Animal implements Swimmer {
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

//stack, create in run time
// Main class to demonstrate the program
public class OOP {
    public static void main(String[] args) {
        // Creating objects of different animal types
        Dog dog = new Dog("Buddy", 3,"Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, true);
        Bird bird = new Bird("Tweety", 1, true);
        Fish fish = new Fish("Nemo", 1, "saltwater");
  
        // Demonstrating methods
        // print()
        System.out.println("=== Dog ===");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());
        dog.makeSound();
        dog.eat();
        dog.sleep();
        dog.wagTail();
        
        System.out.println("\n=== Cat ===");
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Indoor cat: " + cat.isIndoor());
        cat.makeSound();
        cat.eat();
        cat.purr();
        
        System.out.println("\n=== Bird ===");
        System.out.println("Name: " + bird.getName());
        System.out.println("Age: " + bird.getAge());
        bird.makeSound();
        bird.fly();
        
        System.out.println("\n=== Fish ===");
        System.out.println("Name: " + fish.getName());
        System.out.println("Water type: " + fish.getWaterType());
        fish.makeSound();
        fish.swim();
        
        // Demonstrating polymorphism with array
        System.out.println("\n=== Polymorphism Example ===");
        // Creating an array of Animal objects
        Animal[] animals = new Animal[3];
        animals[0] = dog;  // A Dog IS-A Animal
        animals[1] = cat;  // A Cat IS-A Animal
        animals[2] = bird; // A Bird IS-A Animal
        
        // Polymorphic method calls
        for (Animal animal : animals) {
            System.out.print(animal.getName() + ": ");
            animal.makeSound(); // Each animal makes its own sound
        }
    }
} 