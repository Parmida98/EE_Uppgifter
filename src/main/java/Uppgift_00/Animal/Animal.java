package Uppgift_00.Animal;

public sealed interface Animal permits Dog, Snake {
    void makeSound();
}
