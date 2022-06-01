package animals.carnivore.model;

import animals.Animal;
import animals.carnivore.Carnivore;

public class Tiger<T> extends Carnivore {

    public Tiger(String name, String genus) {
        super(name, genus);
    }

    @Override
    public void eat(Animal food) {
        super.eat(food);
    }
}
