package objects;

import interfaces.Ingredient;

/**
 * Created by hnastevska on 9/21/2016.
 */
public class CakeFrosting extends Frosting {

    private String decorations;
    private double quantity;

    public CakeFrosting(Ingredient ingredient, String decorations, double quantity) {
        super(ingredient);
        this.decorations = decorations;
        this.quantity = quantity;
    }

    @Override
    public void make() {
        ingredient.makeFrosting(decorations, quantity);
    }
}
