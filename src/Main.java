public class Main {
    public static void main(String[] args) {
    Dog dog1 =new Dog(8,"tommy","maxican");
    Cat cat1 =new Cat(2,"tom","brown");

    Owner owner1 = new Owner("John","chittagong");
        owner1.adoptPet(dog1);
        owner1.adoptPet(cat1);

        System.out.println("------------------");


        dog1.makeSound();
        dog1.play();
        dog1.feed();


        System.out.println(dog1);

        System.out.println("------------------");
        System.out.println();


        cat1.makeSound();
        cat1.play();
        cat1.feed();
        System.out.println(cat1);
        System.out.println();

        System.out.println("The owner addopted pet :"+owner1.getPetAdopted());
    }
}