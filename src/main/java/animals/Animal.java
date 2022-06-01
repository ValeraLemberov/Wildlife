package animals;

public interface Animal<T> {

    default void eat(T food) {
        if(food.getClass().getName() != this.getClass().getName()) {
            System.out.println(this.getClass().getName() +
                    " eating " + food.getClass().getName());
            return;
        }
        throw new RuntimeException(food.getClass().getName() +
                " can't eat " + this.getClass().getName());
    }
}
