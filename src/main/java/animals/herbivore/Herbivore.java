package animals.herbivore;

import plants.Plant;
import animals.Animal;

public abstract class Herbivore<T extends Plant> implements Animal<T> {
    private String name;

    public Herbivore(String name) {
        this.name = name;
    }

    @Override
    public void eat(T food) {
        Animal.super.eat(food);
    }
}
