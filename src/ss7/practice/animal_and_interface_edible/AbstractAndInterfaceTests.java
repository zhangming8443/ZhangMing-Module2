package ss7.practice.animal_and_interface_edible;

import ss7.practice.animal_and_interface_edible.animal.Animal;
import ss7.practice.animal_and_interface_edible.animal.Chicken;
import ss7.practice.animal_and_interface_edible.animal.Tiger;
import ss7.practice.animal_and_interface_edible.edible.IEdible;
import ss7.practice.animal_and_interface_edible.fruit.Apple;
import ss7.practice.animal_and_interface_edible.fruit.Fruit;
import ss7.practice.animal_and_interface_edible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                IEdible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());

        }
    }
}
