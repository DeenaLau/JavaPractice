/**
 * AnimalImportExample.java - Demonstrates importing and using classes from the animals package
 * 
 * This example shows how to import and use the animal classes defined in the animals package
 */

// Import specific classes from the animals package
import animals.Animal;
import animals.Dog;
import animals.Cat;
import animals.Bird;
import animals.Fish;
import animals.Swimmer;

// Alternatively, we could use a wildcard import:
// import animals.*;

public class AnimalImportExample {
    public static void main(String[] args) {
        System.out.println("Animal Import Example - Using classes from the animals package\n");
        
        // Creating objects using classes defined in the animals package
        Dog myDog = new Dog("Rex", 4, "German Shepherd");
        Cat myCat = new Cat("Luna", 3, false);
        Bird myBird = new Bird("Rio", 2, true);
        
        // Creating a Swimmer array to demonstrate interface usage
        Swimmer[] swimmers = new Swimmer[1];
        swimmers[0] = new Fish("Dory", 1, "saltwater");
        
        // Using the objects
        System.out.println("=== Using Dog object ===");
        System.out.println("Dog name: " + myDog.getName());
        myDog.makeSound();
        myDog.wagTail();
        
        System.out.println("\n=== Using Cat object ===");
        System.out.println("Cat name: " + myCat.getName());
        System.out.println("Is indoor cat? " + (myCat.isIndoor() ? "Yes" : "No"));
        myCat.makeSound();
        myCat.purr();
        
        System.out.println("\n=== Using Bird object ===");
        myBird.makeSound();
        myBird.fly();
        
        System.out.println("\n=== Using Swimmer interface ===");
        for (Swimmer swimmer : swimmers) {
            swimmer.swim();
            
            // We can also cast back to Animal if needed
            if (swimmer instanceof Animal) {
                Animal animal = (Animal) swimmer;
                System.out.println("This swimmer's name is: " + animal.getName());
            }
        }
        
        // Creating an Animal array to demonstrate polymorphism
        Animal[] myPets = {myDog, myCat, myBird};
        
        System.out.println("\n=== Polymorphism with Animals ===");
        for (Animal pet : myPets) {
            System.out.print(pet.getName() + " says: ");
            pet.makeSound();
        }
    }
} 