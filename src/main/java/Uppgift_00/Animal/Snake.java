package Uppgift_00.Animal;

public final class Snake implements Animal, IReptile {
    @Override
    public void makeSound() {
        System.out.println("Ssss");
    }

    @Override
    public void laysEgg() {
        System.out.println("Snake lays around 2-100 eggs, depending on size of snake");
    }
}
