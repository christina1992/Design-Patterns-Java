package objects;

import interfaces.Ingredient;

/**
 * Created by hnastevska on 9/21/2016.
 */
public abstract class Frosting {
    Ingredient ingredient;

    public Frosting(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public abstract void make();
}
