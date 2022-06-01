package animals.herbivore.model;

import animals.herbivore.Herbivore;
import plants.Plant;

public class Cow<T> extends Herbivore {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void eat(Plant food) {
        super.eat(food);
    }
}
