package animals.carnivore;

import animals.Animal;

public abstract class Carnivore<T extends Animal> implements Animal<T>{
    private String name;
    private String genus;

    public Carnivore(String name, String genus) {
        this.name = name;
        this.genus = genus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    @Override
    public void eat(T food) {
        Animal.super.eat(food);
    }
}
