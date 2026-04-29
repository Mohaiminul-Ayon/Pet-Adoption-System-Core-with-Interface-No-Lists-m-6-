

# 🐾 Pet Adoption System (Core Java)

This project is a core implementation of a **Pet Adoption System (PAS)** designed using Java and fundamental **Object-Oriented Programming (OOP)** principles. The system allows an owner to adopt pets and interact with them through various activities.

---

### 🚀 Key OOP Concepts Implemented

The project demonstrates four core pillars of Java programming:

* **Encapsulation**: All class fields (such as `name`, `age`, and `breed`) are kept `private` to ensure data integrity, with access provided through `public` getter and setter methods.
* **Inheritance**: A base `Pet` class serves as the foundation for common attributes, which are shared by specific pet subclasses like `Dog` and `Cat`.
* **Interfaces**: The `PetBehavior` interface defines standard behaviors like `feed()` and `play()` that all pet types must follow.
* **Polymorphism**: Methods like `makeSound()` are overridden in subclasses to provide specific behaviors for different pet types (e.g., "Woof!" for dogs and "Meow!" for cats).

---

### 🛠️ Project Structure

The application is organized into the following components:

* **`PetBehavior` (Interface)**: Declares the core behaviors for pets.
* **`Pet` (Base Class)**: The central class containing shared attributes like name, age, and breed.
* **`Dog` & `Cat` (Subclasses)**: Specific pet implementations that inherit from `Pet` and implement `PetBehavior`.
* **`Owner` (Class)**: Manages the adoption process and keeps track of the number of adopted pets.
* **`Main` (Application)**: The entry point used to create instances and test the system's logic.

---

### ⚠️ Important Features

* **No Collections/Lists**: As per the assignment requirements, this project avoids using `ArrayList` or any other collection framework.
* **Manual Interaction**: All system logic is handled directly through object instances and standard variables.

---

### 📝 How to Run

1. Compile all the `.java` files in the source directory.
2. Run the `Main` class to observe pet interactions and the final adoption summary.

