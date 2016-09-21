package objects;

import interfaces.Ingredient;

/**
 * Created by hnastevska on 9/21/2016.
 */
public class RedVelvetFrosting implements Ingredient {
    @Override
    public void makeFrosting(String ingredient, double quantity) {
        System.out.println("Making Red Velvet Frosting with Extra ingredient: " + ingredient + " with quantity: " + quantity);
    }
}
