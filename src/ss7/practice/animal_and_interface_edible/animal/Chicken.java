package ss7.practice.animal_and_interface_edible.animal;

import ss7.practice.animal_and_interface_edible.animal.Animal;
import ss7.practice.animal_and_interface_edible.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: Gau gau gau";
    }

    @Override
    public String howToEat() {
        return "co the an co";
    }
}
