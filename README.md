

# 🐾 Pet Adoption System (Core Java)

[cite_start]This project is a core implementation of a **Pet Adoption System (PAS)** designed using Java and fundamental **Object-Oriented Programming (OOP)** principles[cite: 1, 39, 536]. [cite_start]The system allows an owner to adopt pets and interact with them through various activities[cite: 31, 33, 537].

---

### 🚀 Key OOP Concepts Implemented

The project demonstrates four core pillars of Java programming:

* [cite_start]**Encapsulation**: All class fields (such as `name`, `age`, and `breed`) are kept `private` to ensure data integrity, with access provided through `public` getter and setter methods[cite: 5, 44, 538].
* [cite_start]**Inheritance**: A base `Pet` class serves as the foundation for common attributes, which are shared by specific pet subclasses like `Dog` and `Cat`[cite: 4, 12, 539].
* [cite_start]**Interfaces**: The `PetBehavior` interface defines standard behaviors like `feed()` and `play()` that all pet types must follow[cite: 7, 8, 540].
* [cite_start]**Polymorphism**: Methods like `makeSound()` are overridden in subclasses to provide specific behaviors for different pet types (e.g., "Woof!" for dogs and "Meow!" for cats)[cite: 6, 20, 541].

---

### 🛠️ Project Structure

The application is organized into the following components:

* [cite_start]**`PetBehavior` (Interface)**: Declares the core behaviors for pets[cite: 7, 74, 542].
* [cite_start]**`Pet` (Base Class)**: The central class containing shared attributes like name, age, and breed[cite: 12, 43, 543].
* [cite_start]**`Dog` & `Cat` (Subclasses)**: Specific pet implementations that inherit from `Pet` and implement `PetBehavior`[cite: 18, 22, 544].
* [cite_start]**`Owner` (Class)**: Manages the adoption process and keeps track of the number of adopted pets[cite: 26, 50, 545].
* [cite_start]**`Main` (Application)**: The entry point used to create instances and test the system's logic[cite: 30, 80, 546].

---

### ⚠️ Important Features

* [cite_start]**No Collections/Lists**: As per the assignment requirements, this project avoids using `ArrayList` or any other collection framework[cite: 2, 53, 547].
* [cite_start]**Manual Interaction**: All system logic is handled directly through object instances and standard variables[cite: 69, 548].

---

### 📝 How to Run

1.  [cite_start]Compile all the `.java` files in the source directory[cite: 510, 550].
2.  [cite_start]Run the `Main` class to observe pet interactions and the final adoption summary[cite: 30, 80, 551].

