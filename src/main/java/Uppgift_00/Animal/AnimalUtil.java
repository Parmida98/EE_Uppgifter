package Uppgift_00.Animal;

public class AnimalUtil {
    public static void checkAnimalType(IAnimal animal) {
        if (animal instanceof IMammal) {
            System.out.println("This animal is a Mammal");
        } else if (animal instanceof IReptile) {
            System.out.println("This animal is a Reptile");
        } else {
            System.out.println("This animal is not a Mammal nor Reptile");
        }
    }
}
