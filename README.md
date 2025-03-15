# Java Import Example

This project demonstrates how to use imports in Java by organizing classes into packages.

## Project Structure

```
.
├── animals/
│   ├── Animal.java         (Abstract base class)
│   ├── Bird.java           (Bird implementation)
│   ├── Cat.java            (Cat implementation)
│   ├── Dog.java            (Dog implementation)
│   ├── Fish.java           (Fish implementation)
│   └── Swimmer.java        (Swimmer interface)
├── AnimalImportExample.java (Main class that imports and uses the animals package)
└── README.md               (This file)
```

## How to Compile and Run

To compile all the classes, run:

```bash
javac animals/*.java
javac AnimalImportExample.java
```

To run the example:

```bash
java AnimalImportExample
```

## Understanding the Example

This example demonstrates several key aspects of Java imports and OOP:

1. **Package Organization**: All animal classes are organized into the `animals` package.
2. **Import Statements**: The main class imports specific classes from the `animals` package.
3. **Class Hierarchy**: The animal hierarchy demonstrates inheritance with abstract base class.
4. **Interfaces**: The `Swimmer` interface shows how interfaces can be implemented.
5. **Polymorphism**: The example shows polymorphic method calls on `Animal` references.

## Alternative Import Approach

Instead of importing each class individually:

```java
import animals.Animal;
import animals.Dog;
import animals.Cat;
// etc.
```

You can use a wildcard import to import all classes from the package:

```java
import animals.*;
```

However, explicit imports are generally preferred for better code readability and to avoid potential naming conflicts. 