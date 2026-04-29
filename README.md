Pet Adoption System (Core Java)
This project is a core implementation of a Pet Adoption System (PAS) designed using Java and fundamental Object-Oriented Programming (OOP) principles. The system allows an owner to adopt pets and interact with them.

🚀 Features & OOP Concepts Used
The project demonstrates the following core Java concepts:


Encapsulation: All class fields (name, age, breed, etc.) are kept private and accessed through public getter and setter methods to ensure data integrity.


Inheritance: A base Pet class contains common attributes shared by different pet types like Dog and Cat.


Interfaces: The PetBehavior interface defines standard actions (feed() and play()) that all pets must implement.


Polymorphism: The makeSound() method is overridden in subclassess to provide specific sounds (e.g., "Woof!" for Dogs and "Meow!" for Cats).


No Collections/Lists: As per assignment requirements, the system is built using manual instances and direct object interaction without any ArrayList or List.

🛠️ Project Structure

PetBehavior (Interface): Defines feed() and play().


Pet (Base Class): Common attributes like name, age, and breed.


Dog & Cat (Subclasses): Inherit from Pet and implement PetBehavior.


Owner (Class): Manages adoption logic and pet counts.


Main (App): Entry point to test the system interactions.

📝 How to Run
Compile all .java files.

Run the Main class to see the pet interaction and adoption summary.
