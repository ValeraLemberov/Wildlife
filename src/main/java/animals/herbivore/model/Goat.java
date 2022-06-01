package animals.herbivore.model;

import animals.herbivore.Herbivore;
import plants.Plant;

public class Goat extends Herbivore {
    public Goat(String name) {
        super(name);
    }

    @Override
    public void eat(Plant food) {
        super.eat(food);
    }
}
