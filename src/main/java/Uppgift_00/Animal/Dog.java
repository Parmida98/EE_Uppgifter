package Uppgift_00.Animal;

public final class Dog implements Animal, IMammal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void givesBirth() {
        System.out.println("Dogs give birth to around 2-6 puppies");
    }
}
