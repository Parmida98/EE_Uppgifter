package Uppgift_00.Animal;

public sealed interface IAnimal permits IMammal, IReptile {
    void makeSound();
}
