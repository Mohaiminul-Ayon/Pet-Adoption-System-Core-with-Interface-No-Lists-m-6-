public class Dog extends Pet implements PetBehavior  {

    public Dog(int age, String name, String breed) {
        super(age,name,breed);
    }


    @Override
    public void feed(){
        System.out.println("Feeding the dog");
    }
    @Override
    public void play(){
        System.out.println("Playing with the dog");
    }

    @Override
    public void makeSound() {
        System.out.println(" Woof!");
    }

    @Override
    public String toString() {
        return "\nDog Details:\n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Breed: " + getBreed();
    }
}
