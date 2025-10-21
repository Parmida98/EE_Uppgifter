package Uppgift_00;

import Uppgift_00.Animal.Animal;
import Uppgift_00.Animal.Dog;
import Uppgift_00.Animal.IAnimal;
import Uppgift_00.Animal.Snake;

import static Uppgift_00.Animal.AnimalUtil.checkAnimalType;

public class Main {
    public static void main(String[] args) {
        Records records = new Records();
        records.name = "Hello World!";

        // Har bytt till Java16 från java 8. Under switch ska den föreslå enhanced switch, och göra det automatiskt. Men det gör den inte.
        int days = 2;
        switch (days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
        }

        Animal dog = new Dog();
        Animal snake = new Snake();

        dog.makeSound();
        snake.makeSound();

        checkAnimalType((IAnimal) dog);
        checkAnimalType((IAnimal) snake);
    }
}
