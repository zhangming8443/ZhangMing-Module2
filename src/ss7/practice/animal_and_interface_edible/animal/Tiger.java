package ss7.practice.animal_and_interface_edible.animal;

import ss7.practice.animal_and_interface_edible.animal.Animal;
import ss7.practice.animal_and_interface_edible.edible.IEdible;

public class Tiger extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Tiger: Tao la meo";
    }

    @Override
    public String howToEat() {
        return "?";
    }
}
