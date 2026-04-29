public class Cat extends Pet implements PetBehavior{
    public Cat(int age,String name,String Breed) {
        super(age,name,Breed);
    }


    @Override
    public void feed(){
        System.out.println("Feeding the cat");
    }
    @Override
    public void play(){
        System.out.println("Playing with the cat");
    }
    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
    @Override
    public String toString() {
        return "\nCat Details:\n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Breed: " + getBreed();
    }
}
